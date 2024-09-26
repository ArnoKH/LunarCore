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
import us.hebi.quickbuf.Utf8String;

public final class FriendListInfoOuterClass {
  /**
   * Protobuf type {@code FriendListInfo}
   */
  public static final class FriendListInfo extends ProtoMessage<FriendListInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .PlayingState playing_state = 3;</code>
     */
    private int playingState;

    /**
     * <code>optional bool is_marked = 4;</code>
     */
    private boolean isMarked;

    /**
     * <code>optional .SimpleInfo simple_info = 2;</code>
     */
    private final SimpleInfoOuterClass.SimpleInfo simpleInfo = SimpleInfoOuterClass.SimpleInfo.newInstance();

    /**
     * <code>optional string remark_name = 13;</code>
     */
    private final Utf8String remarkName = Utf8String.newEmptyInstance();

    private FriendListInfo() {
    }

    /**
     * @return a new empty instance of {@code FriendListInfo}
     */
    public static FriendListInfo newInstance() {
      return new FriendListInfo();
    }

    /**
     * <code>optional .PlayingState playing_state = 3;</code>
     * @return whether the playingState field is set
     */
    public boolean hasPlayingState() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .PlayingState playing_state = 3;</code>
     * @return this
     */
    public FriendListInfo clearPlayingState() {
      bitField0_ &= ~0x00000001;
      playingState = 0;
      return this;
    }

    /**
     * <code>optional .PlayingState playing_state = 3;</code>
     * @return the playingState
     */
    public PlayingStateOuterClass.PlayingState getPlayingState() {
      return PlayingStateOuterClass.PlayingState.forNumber(playingState);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link FriendListInfo#getPlayingState()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getPlayingStateValue() {
      return playingState;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link PlayingStateOuterClass.PlayingState}. Setting an invalid value
     * can cause {@link FriendListInfo#getPlayingState()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public FriendListInfo setPlayingStateValue(final int value) {
      bitField0_ |= 0x00000001;
      playingState = value;
      return this;
    }

    /**
     * <code>optional .PlayingState playing_state = 3;</code>
     * @param value the playingState to set
     * @return this
     */
    public FriendListInfo setPlayingState(final PlayingStateOuterClass.PlayingState value) {
      bitField0_ |= 0x00000001;
      playingState = value.getNumber();
      return this;
    }

    /**
     * <code>optional bool is_marked = 4;</code>
     * @return whether the isMarked field is set
     */
    public boolean hasIsMarked() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_marked = 4;</code>
     * @return this
     */
    public FriendListInfo clearIsMarked() {
      bitField0_ &= ~0x00000002;
      isMarked = false;
      return this;
    }

    /**
     * <code>optional bool is_marked = 4;</code>
     * @return the isMarked
     */
    public boolean getIsMarked() {
      return isMarked;
    }

    /**
     * <code>optional bool is_marked = 4;</code>
     * @param value the isMarked to set
     * @return this
     */
    public FriendListInfo setIsMarked(final boolean value) {
      bitField0_ |= 0x00000002;
      isMarked = value;
      return this;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 2;</code>
     * @return whether the simpleInfo field is set
     */
    public boolean hasSimpleInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 2;</code>
     * @return this
     */
    public FriendListInfo clearSimpleInfo() {
      bitField0_ &= ~0x00000004;
      simpleInfo.clear();
      return this;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSimpleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SimpleInfoOuterClass.SimpleInfo getSimpleInfo() {
      return simpleInfo;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SimpleInfoOuterClass.SimpleInfo getMutableSimpleInfo() {
      bitField0_ |= 0x00000004;
      return simpleInfo;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 2;</code>
     * @param value the simpleInfo to set
     * @return this
     */
    public FriendListInfo setSimpleInfo(final SimpleInfoOuterClass.SimpleInfo value) {
      bitField0_ |= 0x00000004;
      simpleInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string remark_name = 13;</code>
     * @return whether the remarkName field is set
     */
    public boolean hasRemarkName() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional string remark_name = 13;</code>
     * @return this
     */
    public FriendListInfo clearRemarkName() {
      bitField0_ &= ~0x00000008;
      remarkName.clear();
      return this;
    }

    /**
     * <code>optional string remark_name = 13;</code>
     * @return the remarkName
     */
    public String getRemarkName() {
      return remarkName.getString();
    }

    /**
     * <code>optional string remark_name = 13;</code>
     * @return internal {@code Utf8String} representation of remarkName for reading
     */
    public Utf8String getRemarkNameBytes() {
      return this.remarkName;
    }

    /**
     * <code>optional string remark_name = 13;</code>
     * @return internal {@code Utf8String} representation of remarkName for modifications
     */
    public Utf8String getMutableRemarkNameBytes() {
      bitField0_ |= 0x00000008;
      return this.remarkName;
    }

    /**
     * <code>optional string remark_name = 13;</code>
     * @param value the remarkName to set
     * @return this
     */
    public FriendListInfo setRemarkName(final CharSequence value) {
      bitField0_ |= 0x00000008;
      remarkName.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string remark_name = 13;</code>
     * @param value the remarkName to set
     * @return this
     */
    public FriendListInfo setRemarkName(final Utf8String value) {
      bitField0_ |= 0x00000008;
      remarkName.copyFrom(value);
      return this;
    }

    @Override
    public FriendListInfo copyFrom(final FriendListInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        playingState = other.playingState;
        isMarked = other.isMarked;
        simpleInfo.copyFrom(other.simpleInfo);
        remarkName.copyFrom(other.remarkName);
      }
      return this;
    }

    @Override
    public FriendListInfo mergeFrom(final FriendListInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPlayingState()) {
        setPlayingStateValue(other.playingState);
      }
      if (other.hasIsMarked()) {
        setIsMarked(other.isMarked);
      }
      if (other.hasSimpleInfo()) {
        getMutableSimpleInfo().mergeFrom(other.simpleInfo);
      }
      if (other.hasRemarkName()) {
        getMutableRemarkNameBytes().copyFrom(other.remarkName);
      }
      return this;
    }

    @Override
    public FriendListInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      playingState = 0;
      isMarked = false;
      simpleInfo.clear();
      remarkName.clear();
      return this;
    }

    @Override
    public FriendListInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      simpleInfo.clearQuick();
      remarkName.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof FriendListInfo)) {
        return false;
      }
      FriendListInfo other = (FriendListInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasPlayingState() || playingState == other.playingState)
        && (!hasIsMarked() || isMarked == other.isMarked)
        && (!hasSimpleInfo() || simpleInfo.equals(other.simpleInfo))
        && (!hasRemarkName() || remarkName.equals(other.remarkName));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeEnumNoTag(playingState);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeBoolNoTag(isMarked);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(simpleInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 106);
        output.writeStringNoTag(remarkName);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(playingState);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(simpleInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(remarkName);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FriendListInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // playingState
            final int value = input.readInt32();
            if (PlayingStateOuterClass.PlayingState.forNumber(value) != null) {
              playingState = value;
              bitField0_ |= 0x00000001;
            }
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // isMarked
            isMarked = input.readBool();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // simpleInfo
            input.readMessage(simpleInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // remarkName
            input.readString(remarkName);
            bitField0_ |= 0x00000008;
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
        output.writeEnum(FieldNames.playingState, playingState, PlayingStateOuterClass.PlayingState.converter());
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isMarked, isMarked);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.simpleInfo, simpleInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeString(FieldNames.remarkName, remarkName);
      }
      output.endObject();
    }

    @Override
    public FriendListInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -583798525:
          case -574710464: {
            if (input.isAtField(FieldNames.playingState)) {
              if (!input.trySkipNullValue()) {
                final PlayingStateOuterClass.PlayingState value = input.readEnum(PlayingStateOuterClass.PlayingState.converter());
                if (value != null) {
                  playingState = value.getNumber();
                  bitField0_ |= 0x00000001;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -407271946:
          case -617266975: {
            if (input.isAtField(FieldNames.isMarked)) {
              if (!input.trySkipNullValue()) {
                isMarked = input.readBool();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1431903872:
          case -1419171045: {
            if (input.isAtField(FieldNames.simpleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(simpleInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1449259563:
          case 1993449450: {
            if (input.isAtField(FieldNames.remarkName)) {
              if (!input.trySkipNullValue()) {
                input.readString(remarkName);
                bitField0_ |= 0x00000008;
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
    public FriendListInfo clone() {
      return new FriendListInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FriendListInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FriendListInfo(), data).checkInitialized();
    }

    public static FriendListInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FriendListInfo(), input).checkInitialized();
    }

    public static FriendListInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FriendListInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating FriendListInfo messages
     */
    public static MessageFactory<FriendListInfo> getFactory() {
      return FriendListInfoFactory.INSTANCE;
    }

    private enum FriendListInfoFactory implements MessageFactory<FriendListInfo> {
      INSTANCE;

      @Override
      public FriendListInfo create() {
        return FriendListInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName playingState = FieldName.forField("playingState", "playing_state");

      static final FieldName isMarked = FieldName.forField("isMarked", "is_marked");

      static final FieldName simpleInfo = FieldName.forField("simpleInfo", "simple_info");

      static final FieldName remarkName = FieldName.forField("remarkName", "remark_name");
    }
  }
}
