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

public final class SceneActorInfoOuterClass {
  /**
   * Protobuf type {@code SceneActorInfo}
   */
  public static final class SceneActorInfo extends ProtoMessage<SceneActorInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 uid = 2;</code>
     */
    private int uid;

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     */
    private int baseAvatarId;

    /**
     * <code>optional uint32 map_layer = 15;</code>
     */
    private int mapLayer;

    /**
     * <code>optional .AvatarType avatar_type = 6;</code>
     */
    private int avatarType;

    private SceneActorInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneActorInfo}
     */
    public static SceneActorInfo newInstance() {
      return new SceneActorInfo();
    }

    /**
     * <code>optional uint32 uid = 2;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 uid = 2;</code>
     * @return this
     */
    public SceneActorInfo clearUid() {
      bitField0_ &= ~0x00000001;
      uid = 0;
      return this;
    }

    /**
     * <code>optional uint32 uid = 2;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <code>optional uint32 uid = 2;</code>
     * @param value the uid to set
     * @return this
     */
    public SceneActorInfo setUid(final int value) {
      bitField0_ |= 0x00000001;
      uid = value;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     * @return this
     */
    public SceneActorInfo clearBaseAvatarId() {
      bitField0_ &= ~0x00000002;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public SceneActorInfo setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000002;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 map_layer = 15;</code>
     * @return whether the mapLayer field is set
     */
    public boolean hasMapLayer() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 map_layer = 15;</code>
     * @return this
     */
    public SceneActorInfo clearMapLayer() {
      bitField0_ &= ~0x00000004;
      mapLayer = 0;
      return this;
    }

    /**
     * <code>optional uint32 map_layer = 15;</code>
     * @return the mapLayer
     */
    public int getMapLayer() {
      return mapLayer;
    }

    /**
     * <code>optional uint32 map_layer = 15;</code>
     * @param value the mapLayer to set
     * @return this
     */
    public SceneActorInfo setMapLayer(final int value) {
      bitField0_ |= 0x00000004;
      mapLayer = value;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 6;</code>
     * @return whether the avatarType field is set
     */
    public boolean hasAvatarType() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .AvatarType avatar_type = 6;</code>
     * @return this
     */
    public SceneActorInfo clearAvatarType() {
      bitField0_ &= ~0x00000008;
      avatarType = 0;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 6;</code>
     * @return the avatarType
     */
    public AvatarTypeOuterClass.AvatarType getAvatarType() {
      return AvatarTypeOuterClass.AvatarType.forNumber(avatarType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link SceneActorInfo#getAvatarType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getAvatarTypeValue() {
      return avatarType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link AvatarTypeOuterClass.AvatarType}. Setting an invalid value
     * can cause {@link SceneActorInfo#getAvatarType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public SceneActorInfo setAvatarTypeValue(final int value) {
      bitField0_ |= 0x00000008;
      avatarType = value;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 6;</code>
     * @param value the avatarType to set
     * @return this
     */
    public SceneActorInfo setAvatarType(final AvatarTypeOuterClass.AvatarType value) {
      bitField0_ |= 0x00000008;
      avatarType = value.getNumber();
      return this;
    }

    @Override
    public SceneActorInfo copyFrom(final SceneActorInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        uid = other.uid;
        baseAvatarId = other.baseAvatarId;
        mapLayer = other.mapLayer;
        avatarType = other.avatarType;
      }
      return this;
    }

    @Override
    public SceneActorInfo mergeFrom(final SceneActorInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUid()) {
        setUid(other.uid);
      }
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasMapLayer()) {
        setMapLayer(other.mapLayer);
      }
      if (other.hasAvatarType()) {
        setAvatarTypeValue(other.avatarType);
      }
      return this;
    }

    @Override
    public SceneActorInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      uid = 0;
      baseAvatarId = 0;
      mapLayer = 0;
      avatarType = 0;
      return this;
    }

    @Override
    public SceneActorInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneActorInfo)) {
        return false;
      }
      SceneActorInfo other = (SceneActorInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasUid() || uid == other.uid)
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasMapLayer() || mapLayer == other.mapLayer)
        && (!hasAvatarType() || avatarType == other.avatarType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(mapLayer);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 48);
        output.writeEnumNoTag(avatarType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mapLayer);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(avatarType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneActorInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // uid
            uid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // mapLayer
            mapLayer = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // avatarType
            final int value = input.readInt32();
            if (AvatarTypeOuterClass.AvatarType.forNumber(value) != null) {
              avatarType = value;
              bitField0_ |= 0x00000008;
            }
            tag = input.readTag();
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.uid, uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.mapLayer, mapLayer);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeEnum(FieldNames.avatarType, avatarType, AvatarTypeOuterClass.AvatarType.converter());
      }
      output.endObject();
    }

    @Override
    public SceneActorInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 115792: {
            if (input.isAtField(FieldNames.uid)) {
              if (!input.trySkipNullValue()) {
                uid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 160971093:
          case 1248553134: {
            if (input.isAtField(FieldNames.mapLayer)) {
              if (!input.trySkipNullValue()) {
                mapLayer = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -403148749:
          case 397309536: {
            if (input.isAtField(FieldNames.avatarType)) {
              if (!input.trySkipNullValue()) {
                final AvatarTypeOuterClass.AvatarType value = input.readEnum(AvatarTypeOuterClass.AvatarType.converter());
                if (value != null) {
                  avatarType = value.getNumber();
                  bitField0_ |= 0x00000008;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public SceneActorInfo clone() {
      return new SceneActorInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneActorInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneActorInfo(), data).checkInitialized();
    }

    public static SceneActorInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneActorInfo(), input).checkInitialized();
    }

    public static SceneActorInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneActorInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneActorInfo messages
     */
    public static MessageFactory<SceneActorInfo> getFactory() {
      return SceneActorInfoFactory.INSTANCE;
    }

    private enum SceneActorInfoFactory implements MessageFactory<SceneActorInfo> {
      INSTANCE;

      @Override
      public SceneActorInfo create() {
        return SceneActorInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName uid = FieldName.forField("uid");

      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName mapLayer = FieldName.forField("mapLayer", "map_layer");

      static final FieldName avatarType = FieldName.forField("avatarType", "avatar_type");
    }
  }
}
