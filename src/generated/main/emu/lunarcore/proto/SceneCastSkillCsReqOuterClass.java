// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class SceneCastSkillCsReqOuterClass {
  /**
   * Protobuf type {@code SceneCastSkillCsReq}
   */
  public static final class SceneCastSkillCsReq extends ProtoMessage<SceneCastSkillCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 skill_index = 4;</code>
     */
    private int skillIndex;

    /**
     * <code>optional uint32 caster_id = 14;</code>
     */
    private int casterId;

    /**
     * <code>optional uint32 attacked_group_id = 15;</code>
     */
    private int attackedGroupId;

    /**
     * <code>optional .MotionInfo target_motion = 5;</code>
     */
    private final MotionInfoOuterClass.MotionInfo targetMotion = MotionInfoOuterClass.MotionInfo.newInstance();

    /**
     * <code>repeated uint32 hit_target_entity_id_list = 10;</code>
     */
    private final RepeatedInt hitTargetEntityIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .AssistMonsterWave assist_monster_wave_list = 12;</code>
     */
    private final RepeatedMessage<AssistMonsterWaveOuterClass.AssistMonsterWave> assistMonsterWaveList = RepeatedMessage.newEmptyInstance(AssistMonsterWaveOuterClass.AssistMonsterWave.getFactory());

    private SceneCastSkillCsReq() {
    }

    /**
     * @return a new empty instance of {@code SceneCastSkillCsReq}
     */
    public static SceneCastSkillCsReq newInstance() {
      return new SceneCastSkillCsReq();
    }

    /**
     * <code>optional uint32 skill_index = 4;</code>
     * @return whether the skillIndex field is set
     */
    public boolean hasSkillIndex() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 skill_index = 4;</code>
     * @return this
     */
    public SceneCastSkillCsReq clearSkillIndex() {
      bitField0_ &= ~0x00000001;
      skillIndex = 0;
      return this;
    }

    /**
     * <code>optional uint32 skill_index = 4;</code>
     * @return the skillIndex
     */
    public int getSkillIndex() {
      return skillIndex;
    }

    /**
     * <code>optional uint32 skill_index = 4;</code>
     * @param value the skillIndex to set
     * @return this
     */
    public SceneCastSkillCsReq setSkillIndex(final int value) {
      bitField0_ |= 0x00000001;
      skillIndex = value;
      return this;
    }

    /**
     * <code>optional uint32 caster_id = 14;</code>
     * @return whether the casterId field is set
     */
    public boolean hasCasterId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 caster_id = 14;</code>
     * @return this
     */
    public SceneCastSkillCsReq clearCasterId() {
      bitField0_ &= ~0x00000002;
      casterId = 0;
      return this;
    }

    /**
     * <code>optional uint32 caster_id = 14;</code>
     * @return the casterId
     */
    public int getCasterId() {
      return casterId;
    }

    /**
     * <code>optional uint32 caster_id = 14;</code>
     * @param value the casterId to set
     * @return this
     */
    public SceneCastSkillCsReq setCasterId(final int value) {
      bitField0_ |= 0x00000002;
      casterId = value;
      return this;
    }

    /**
     * <code>optional uint32 attacked_group_id = 15;</code>
     * @return whether the attackedGroupId field is set
     */
    public boolean hasAttackedGroupId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 attacked_group_id = 15;</code>
     * @return this
     */
    public SceneCastSkillCsReq clearAttackedGroupId() {
      bitField0_ &= ~0x00000004;
      attackedGroupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 attacked_group_id = 15;</code>
     * @return the attackedGroupId
     */
    public int getAttackedGroupId() {
      return attackedGroupId;
    }

    /**
     * <code>optional uint32 attacked_group_id = 15;</code>
     * @param value the attackedGroupId to set
     * @return this
     */
    public SceneCastSkillCsReq setAttackedGroupId(final int value) {
      bitField0_ |= 0x00000004;
      attackedGroupId = value;
      return this;
    }

    /**
     * <code>optional .MotionInfo target_motion = 5;</code>
     * @return whether the targetMotion field is set
     */
    public boolean hasTargetMotion() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .MotionInfo target_motion = 5;</code>
     * @return this
     */
    public SceneCastSkillCsReq clearTargetMotion() {
      bitField0_ &= ~0x00000008;
      targetMotion.clear();
      return this;
    }

    /**
     * <code>optional .MotionInfo target_motion = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTargetMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getTargetMotion() {
      return targetMotion;
    }

    /**
     * <code>optional .MotionInfo target_motion = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableTargetMotion() {
      bitField0_ |= 0x00000008;
      return targetMotion;
    }

    /**
     * <code>optional .MotionInfo target_motion = 5;</code>
     * @param value the targetMotion to set
     * @return this
     */
    public SceneCastSkillCsReq setTargetMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000008;
      targetMotion.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated uint32 hit_target_entity_id_list = 10;</code>
     * @return whether the hitTargetEntityIdList field is set
     */
    public boolean hasHitTargetEntityIdList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated uint32 hit_target_entity_id_list = 10;</code>
     * @return this
     */
    public SceneCastSkillCsReq clearHitTargetEntityIdList() {
      bitField0_ &= ~0x00000010;
      hitTargetEntityIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 hit_target_entity_id_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableHitTargetEntityIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getHitTargetEntityIdList() {
      return hitTargetEntityIdList;
    }

    /**
     * <code>repeated uint32 hit_target_entity_id_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableHitTargetEntityIdList() {
      bitField0_ |= 0x00000010;
      return hitTargetEntityIdList;
    }

    /**
     * <code>repeated uint32 hit_target_entity_id_list = 10;</code>
     * @param value the hitTargetEntityIdList to add
     * @return this
     */
    public SceneCastSkillCsReq addHitTargetEntityIdList(final int value) {
      bitField0_ |= 0x00000010;
      hitTargetEntityIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 hit_target_entity_id_list = 10;</code>
     * @param values the hitTargetEntityIdList to add
     * @return this
     */
    public SceneCastSkillCsReq addAllHitTargetEntityIdList(final int... values) {
      bitField0_ |= 0x00000010;
      hitTargetEntityIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .AssistMonsterWave assist_monster_wave_list = 12;</code>
     * @return whether the assistMonsterWaveList field is set
     */
    public boolean hasAssistMonsterWaveList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .AssistMonsterWave assist_monster_wave_list = 12;</code>
     * @return this
     */
    public SceneCastSkillCsReq clearAssistMonsterWaveList() {
      bitField0_ &= ~0x00000020;
      assistMonsterWaveList.clear();
      return this;
    }

    /**
     * <code>repeated .AssistMonsterWave assist_monster_wave_list = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAssistMonsterWaveList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AssistMonsterWaveOuterClass.AssistMonsterWave> getAssistMonsterWaveList(
        ) {
      return assistMonsterWaveList;
    }

    /**
     * <code>repeated .AssistMonsterWave assist_monster_wave_list = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AssistMonsterWaveOuterClass.AssistMonsterWave> getMutableAssistMonsterWaveList(
        ) {
      bitField0_ |= 0x00000020;
      return assistMonsterWaveList;
    }

    /**
     * <code>repeated .AssistMonsterWave assist_monster_wave_list = 12;</code>
     * @param value the assistMonsterWaveList to add
     * @return this
     */
    public SceneCastSkillCsReq addAssistMonsterWaveList(
        final AssistMonsterWaveOuterClass.AssistMonsterWave value) {
      bitField0_ |= 0x00000020;
      assistMonsterWaveList.add(value);
      return this;
    }

    /**
     * <code>repeated .AssistMonsterWave assist_monster_wave_list = 12;</code>
     * @param values the assistMonsterWaveList to add
     * @return this
     */
    public SceneCastSkillCsReq addAllAssistMonsterWaveList(
        final AssistMonsterWaveOuterClass.AssistMonsterWave... values) {
      bitField0_ |= 0x00000020;
      assistMonsterWaveList.addAll(values);
      return this;
    }

    @Override
    public SceneCastSkillCsReq copyFrom(final SceneCastSkillCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        skillIndex = other.skillIndex;
        casterId = other.casterId;
        attackedGroupId = other.attackedGroupId;
        targetMotion.copyFrom(other.targetMotion);
        hitTargetEntityIdList.copyFrom(other.hitTargetEntityIdList);
        assistMonsterWaveList.copyFrom(other.assistMonsterWaveList);
      }
      return this;
    }

    @Override
    public SceneCastSkillCsReq mergeFrom(final SceneCastSkillCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSkillIndex()) {
        setSkillIndex(other.skillIndex);
      }
      if (other.hasCasterId()) {
        setCasterId(other.casterId);
      }
      if (other.hasAttackedGroupId()) {
        setAttackedGroupId(other.attackedGroupId);
      }
      if (other.hasTargetMotion()) {
        getMutableTargetMotion().mergeFrom(other.targetMotion);
      }
      if (other.hasHitTargetEntityIdList()) {
        getMutableHitTargetEntityIdList().addAll(other.hitTargetEntityIdList);
      }
      if (other.hasAssistMonsterWaveList()) {
        getMutableAssistMonsterWaveList().addAll(other.assistMonsterWaveList);
      }
      return this;
    }

    @Override
    public SceneCastSkillCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      skillIndex = 0;
      casterId = 0;
      attackedGroupId = 0;
      targetMotion.clear();
      hitTargetEntityIdList.clear();
      assistMonsterWaveList.clear();
      return this;
    }

    @Override
    public SceneCastSkillCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      targetMotion.clearQuick();
      hitTargetEntityIdList.clear();
      assistMonsterWaveList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneCastSkillCsReq)) {
        return false;
      }
      SceneCastSkillCsReq other = (SceneCastSkillCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasSkillIndex() || skillIndex == other.skillIndex)
        && (!hasCasterId() || casterId == other.casterId)
        && (!hasAttackedGroupId() || attackedGroupId == other.attackedGroupId)
        && (!hasTargetMotion() || targetMotion.equals(other.targetMotion))
        && (!hasHitTargetEntityIdList() || hitTargetEntityIdList.equals(other.hitTargetEntityIdList))
        && (!hasAssistMonsterWaveList() || assistMonsterWaveList.equals(other.assistMonsterWaveList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(skillIndex);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(casterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(attackedGroupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(targetMotion);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < hitTargetEntityIdList.length(); i++) {
          output.writeRawByte((byte) 80);
          output.writeUInt32NoTag(hitTargetEntityIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < assistMonsterWaveList.length(); i++) {
          output.writeRawByte((byte) 98);
          output.writeMessageNoTag(assistMonsterWaveList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(skillIndex);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(casterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(attackedGroupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(targetMotion);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * hitTargetEntityIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(hitTargetEntityIdList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * assistMonsterWaveList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(assistMonsterWaveList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneCastSkillCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // skillIndex
            skillIndex = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // casterId
            casterId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // attackedGroupId
            attackedGroupId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // targetMotion
            input.readMessage(targetMotion);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // hitTargetEntityIdList [packed=true]
            input.readPackedUInt32(hitTargetEntityIdList, tag);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // assistMonsterWaveList
            tag = input.readRepeatedMessage(assistMonsterWaveList, tag);
            bitField0_ |= 0x00000020;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 80: {
            // hitTargetEntityIdList [packed=false]
            tag = input.readRepeatedUInt32(hitTargetEntityIdList, tag);
            bitField0_ |= 0x00000010;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.skillIndex, skillIndex);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.casterId, casterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.attackedGroupId, attackedGroupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.targetMotion, targetMotion);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedUInt32(FieldNames.hitTargetEntityIdList, hitTargetEntityIdList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.assistMonsterWaveList, assistMonsterWaveList);
      }
      output.endObject();
    }

    @Override
    public SceneCastSkillCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1587034369:
          case -1716021916: {
            if (input.isAtField(FieldNames.skillIndex)) {
              if (!input.trySkipNullValue()) {
                skillIndex = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 35676775:
          case 1106001422: {
            if (input.isAtField(FieldNames.casterId)) {
              if (!input.trySkipNullValue()) {
                casterId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1725961965:
          case -715836621: {
            if (input.isAtField(FieldNames.attackedGroupId)) {
              if (!input.trySkipNullValue()) {
                attackedGroupId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -716903257:
          case -2015521244: {
            if (input.isAtField(FieldNames.targetMotion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(targetMotion);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1319168832:
          case -35493464: {
            if (input.isAtField(FieldNames.hitTargetEntityIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(hitTargetEntityIdList);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 932756360:
          case 1103792041: {
            if (input.isAtField(FieldNames.assistMonsterWaveList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(assistMonsterWaveList);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SceneCastSkillCsReq clone() {
      return new SceneCastSkillCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneCastSkillCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneCastSkillCsReq(), data).checkInitialized();
    }

    public static SceneCastSkillCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneCastSkillCsReq(), input).checkInitialized();
    }

    public static SceneCastSkillCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneCastSkillCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneCastSkillCsReq messages
     */
    public static MessageFactory<SceneCastSkillCsReq> getFactory() {
      return SceneCastSkillCsReqFactory.INSTANCE;
    }

    private enum SceneCastSkillCsReqFactory implements MessageFactory<SceneCastSkillCsReq> {
      INSTANCE;

      @Override
      public SceneCastSkillCsReq create() {
        return SceneCastSkillCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName skillIndex = FieldName.forField("skillIndex", "skill_index");

      static final FieldName casterId = FieldName.forField("casterId", "caster_id");

      static final FieldName attackedGroupId = FieldName.forField("attackedGroupId", "attacked_group_id");

      static final FieldName targetMotion = FieldName.forField("targetMotion", "target_motion");

      static final FieldName hitTargetEntityIdList = FieldName.forField("hitTargetEntityIdList", "hit_target_entity_id_list");

      static final FieldName assistMonsterWaveList = FieldName.forField("assistMonsterWaveList", "assist_monster_wave_list");
    }
  }
}
