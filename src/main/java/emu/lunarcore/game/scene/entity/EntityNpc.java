package emu.lunarcore.game.scene.entity;

import emu.lunarcore.data.config.GroupInfo;
import emu.lunarcore.data.config.NpcInfo;
import emu.lunarcore.game.rogue.event.RogueEventInstance;
import emu.lunarcore.game.scene.Scene;
import emu.lunarcore.proto.MotionInfoOuterClass.MotionInfo;
import emu.lunarcore.proto.NpcRogueInfoOuterClass.NpcRogueInfo;
import emu.lunarcore.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import emu.lunarcore.proto.SceneNpcInfoOuterClass.SceneNpcInfo;
import emu.lunarcore.util.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
public class EntityNpc implements GameEntity {
    @Setter private int entityId;
    @Setter private int groupId;
    @Setter private int instId;
    @Setter private int npcId;
    
    private final Scene scene;
    private final Position pos;
    private final Position rot;
    
    @Setter private RogueEventInstance eventInstance;
    
    public EntityNpc(Scene scene, GroupInfo group, NpcInfo npcInfo) {
        this.scene = scene;
        this.npcId = npcInfo.getNPCID();
        this.pos = npcInfo.getPos().clone();
        this.rot = npcInfo.getRot().clone();
        this.groupId = group.getId();
        this.instId = npcInfo.getID();
    }

    @Override
    public SceneEntityInfo toSceneEntityProto() {
        // Base npc info
        var npc = SceneNpcInfo.newInstance()
                .setNpcId(this.getNpcId());
        
        // Rogue data
        if (this.eventInstance != null) {
            var rogue = NpcRogueInfo.newInstance()
                    .setEventId(this.eventInstance.EventId)
                    .setFinishDialogue(this.eventInstance.Finished)
                    .setEventUniqueId(this.eventInstance.EventUniqueId);
            
            for (var option: this.eventInstance.Options)
                rogue.addDialogueEventParamList(option.toNpcProto());
            
            npc.getMutableExtraInfo().setRogueInfo(rogue);
        }

        // Main entity proto
        var proto = SceneEntityInfo.newInstance()
                .setEntityId(this.getEntityId())
                .setGroupId(this.getGroupId())
                .setInstId(this.getInstId())
                .setMotion(MotionInfo.newInstance().setPos(getPos().toProto()).setRot(getRot().toProto()))
                .setNpc(npc);

        return proto;
    }

}
