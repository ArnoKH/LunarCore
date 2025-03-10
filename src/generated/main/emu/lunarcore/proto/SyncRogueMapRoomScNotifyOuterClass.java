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

public final class SyncRogueMapRoomScNotifyOuterClass {
  /**
   * Protobuf type {@code SyncRogueMapRoomScNotify}
   */
  public static final class SyncRogueMapRoomScNotify extends ProtoMessage<SyncRogueMapRoomScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 map_id = 1;</code>
     */
    private int mapId;

    /**
     * <code>optional .RogueRoom cur_room = 7;</code>
     */
    private final RogueRoomOuterClass.RogueRoom curRoom = RogueRoomOuterClass.RogueRoom.newInstance();

    private SyncRogueMapRoomScNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncRogueMapRoomScNotify}
     */
    public static SyncRogueMapRoomScNotify newInstance() {
      return new SyncRogueMapRoomScNotify();
    }

    /**
     * <code>optional uint32 map_id = 1;</code>
     * @return whether the mapId field is set
     */
    public boolean hasMapId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 map_id = 1;</code>
     * @return this
     */
    public SyncRogueMapRoomScNotify clearMapId() {
      bitField0_ &= ~0x00000001;
      mapId = 0;
      return this;
    }

    /**
     * <code>optional uint32 map_id = 1;</code>
     * @return the mapId
     */
    public int getMapId() {
      return mapId;
    }

    /**
     * <code>optional uint32 map_id = 1;</code>
     * @param value the mapId to set
     * @return this
     */
    public SyncRogueMapRoomScNotify setMapId(final int value) {
      bitField0_ |= 0x00000001;
      mapId = value;
      return this;
    }

    /**
     * <code>optional .RogueRoom cur_room = 7;</code>
     * @return whether the curRoom field is set
     */
    public boolean hasCurRoom() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueRoom cur_room = 7;</code>
     * @return this
     */
    public SyncRogueMapRoomScNotify clearCurRoom() {
      bitField0_ &= ~0x00000002;
      curRoom.clear();
      return this;
    }

    /**
     * <code>optional .RogueRoom cur_room = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCurRoom()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueRoomOuterClass.RogueRoom getCurRoom() {
      return curRoom;
    }

    /**
     * <code>optional .RogueRoom cur_room = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueRoomOuterClass.RogueRoom getMutableCurRoom() {
      bitField0_ |= 0x00000002;
      return curRoom;
    }

    /**
     * <code>optional .RogueRoom cur_room = 7;</code>
     * @param value the curRoom to set
     * @return this
     */
    public SyncRogueMapRoomScNotify setCurRoom(final RogueRoomOuterClass.RogueRoom value) {
      bitField0_ |= 0x00000002;
      curRoom.copyFrom(value);
      return this;
    }

    @Override
    public SyncRogueMapRoomScNotify copyFrom(final SyncRogueMapRoomScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mapId = other.mapId;
        curRoom.copyFrom(other.curRoom);
      }
      return this;
    }

    @Override
    public SyncRogueMapRoomScNotify mergeFrom(final SyncRogueMapRoomScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMapId()) {
        setMapId(other.mapId);
      }
      if (other.hasCurRoom()) {
        getMutableCurRoom().mergeFrom(other.curRoom);
      }
      return this;
    }

    @Override
    public SyncRogueMapRoomScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mapId = 0;
      curRoom.clear();
      return this;
    }

    @Override
    public SyncRogueMapRoomScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curRoom.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncRogueMapRoomScNotify)) {
        return false;
      }
      SyncRogueMapRoomScNotify other = (SyncRogueMapRoomScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasMapId() || mapId == other.mapId)
        && (!hasCurRoom() || curRoom.equals(other.curRoom));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(mapId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(curRoom);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mapId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(curRoom);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncRogueMapRoomScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // mapId
            mapId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // curRoom
            input.readMessage(curRoom);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.mapId, mapId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.curRoom, curRoom);
      }
      output.endObject();
    }

    @Override
    public SyncRogueMapRoomScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 103663511:
          case -1081377058: {
            if (input.isAtField(FieldNames.mapId)) {
              if (!input.trySkipNullValue()) {
                mapId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1125996347:
          case 558243706: {
            if (input.isAtField(FieldNames.curRoom)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(curRoom);
                bitField0_ |= 0x00000002;
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
    public SyncRogueMapRoomScNotify clone() {
      return new SyncRogueMapRoomScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncRogueMapRoomScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncRogueMapRoomScNotify(), data).checkInitialized();
    }

    public static SyncRogueMapRoomScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncRogueMapRoomScNotify(), input).checkInitialized();
    }

    public static SyncRogueMapRoomScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncRogueMapRoomScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncRogueMapRoomScNotify messages
     */
    public static MessageFactory<SyncRogueMapRoomScNotify> getFactory() {
      return SyncRogueMapRoomScNotifyFactory.INSTANCE;
    }

    private enum SyncRogueMapRoomScNotifyFactory implements MessageFactory<SyncRogueMapRoomScNotify> {
      INSTANCE;

      @Override
      public SyncRogueMapRoomScNotify create() {
        return SyncRogueMapRoomScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mapId = FieldName.forField("mapId", "map_id");

      static final FieldName curRoom = FieldName.forField("curRoom", "cur_room");
    }
  }
}
