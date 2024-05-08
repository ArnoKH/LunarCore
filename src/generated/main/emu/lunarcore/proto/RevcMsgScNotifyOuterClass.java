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

public final class RevcMsgScNotifyOuterClass {
  /**
   * Protobuf type {@code RevcMsgScNotify}
   */
  public static final class RevcMsgScNotify extends ProtoMessage<RevcMsgScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 emote = 2;</code>
     */
    private int emote;

    /**
     * <code>optional uint32 to_uid = 3;</code>
     */
    private int toUid;

    /**
     * <code>optional uint32 from_uid = 11;</code>
     */
    private int fromUid;

    /**
     * <code>optional .ChatType chat_type = 6;</code>
     */
    private int chatType;

    /**
     * <code>optional .MsgType msg_type = 15;</code>
     */
    private int msgType;

    /**
     * <code>optional string text = 9;</code>
     */
    private final Utf8String text = Utf8String.newEmptyInstance();

    private RevcMsgScNotify() {
    }

    /**
     * @return a new empty instance of {@code RevcMsgScNotify}
     */
    public static RevcMsgScNotify newInstance() {
      return new RevcMsgScNotify();
    }

    /**
     * <code>optional uint32 emote = 2;</code>
     * @return whether the emote field is set
     */
    public boolean hasEmote() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 emote = 2;</code>
     * @return this
     */
    public RevcMsgScNotify clearEmote() {
      bitField0_ &= ~0x00000001;
      emote = 0;
      return this;
    }

    /**
     * <code>optional uint32 emote = 2;</code>
     * @return the emote
     */
    public int getEmote() {
      return emote;
    }

    /**
     * <code>optional uint32 emote = 2;</code>
     * @param value the emote to set
     * @return this
     */
    public RevcMsgScNotify setEmote(final int value) {
      bitField0_ |= 0x00000001;
      emote = value;
      return this;
    }

    /**
     * <code>optional uint32 to_uid = 3;</code>
     * @return whether the toUid field is set
     */
    public boolean hasToUid() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 to_uid = 3;</code>
     * @return this
     */
    public RevcMsgScNotify clearToUid() {
      bitField0_ &= ~0x00000002;
      toUid = 0;
      return this;
    }

    /**
     * <code>optional uint32 to_uid = 3;</code>
     * @return the toUid
     */
    public int getToUid() {
      return toUid;
    }

    /**
     * <code>optional uint32 to_uid = 3;</code>
     * @param value the toUid to set
     * @return this
     */
    public RevcMsgScNotify setToUid(final int value) {
      bitField0_ |= 0x00000002;
      toUid = value;
      return this;
    }

    /**
     * <code>optional uint32 from_uid = 11;</code>
     * @return whether the fromUid field is set
     */
    public boolean hasFromUid() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 from_uid = 11;</code>
     * @return this
     */
    public RevcMsgScNotify clearFromUid() {
      bitField0_ &= ~0x00000004;
      fromUid = 0;
      return this;
    }

    /**
     * <code>optional uint32 from_uid = 11;</code>
     * @return the fromUid
     */
    public int getFromUid() {
      return fromUid;
    }

    /**
     * <code>optional uint32 from_uid = 11;</code>
     * @param value the fromUid to set
     * @return this
     */
    public RevcMsgScNotify setFromUid(final int value) {
      bitField0_ |= 0x00000004;
      fromUid = value;
      return this;
    }

    /**
     * <code>optional .ChatType chat_type = 6;</code>
     * @return whether the chatType field is set
     */
    public boolean hasChatType() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ChatType chat_type = 6;</code>
     * @return this
     */
    public RevcMsgScNotify clearChatType() {
      bitField0_ &= ~0x00000008;
      chatType = 0;
      return this;
    }

    /**
     * <code>optional .ChatType chat_type = 6;</code>
     * @return the chatType
     */
    public ChatTypeOuterClass.ChatType getChatType() {
      return ChatTypeOuterClass.ChatType.forNumber(chatType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link RevcMsgScNotify#getChatType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getChatTypeValue() {
      return chatType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ChatTypeOuterClass.ChatType}. Setting an invalid value
     * can cause {@link RevcMsgScNotify#getChatType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public RevcMsgScNotify setChatTypeValue(final int value) {
      bitField0_ |= 0x00000008;
      chatType = value;
      return this;
    }

    /**
     * <code>optional .ChatType chat_type = 6;</code>
     * @param value the chatType to set
     * @return this
     */
    public RevcMsgScNotify setChatType(final ChatTypeOuterClass.ChatType value) {
      bitField0_ |= 0x00000008;
      chatType = value.getNumber();
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 15;</code>
     * @return whether the msgType field is set
     */
    public boolean hasMsgType() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .MsgType msg_type = 15;</code>
     * @return this
     */
    public RevcMsgScNotify clearMsgType() {
      bitField0_ &= ~0x00000010;
      msgType = 0;
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 15;</code>
     * @return the msgType
     */
    public MsgTypeOuterClass.MsgType getMsgType() {
      return MsgTypeOuterClass.MsgType.forNumber(msgType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link RevcMsgScNotify#getMsgType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getMsgTypeValue() {
      return msgType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link MsgTypeOuterClass.MsgType}. Setting an invalid value
     * can cause {@link RevcMsgScNotify#getMsgType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public RevcMsgScNotify setMsgTypeValue(final int value) {
      bitField0_ |= 0x00000010;
      msgType = value;
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 15;</code>
     * @param value the msgType to set
     * @return this
     */
    public RevcMsgScNotify setMsgType(final MsgTypeOuterClass.MsgType value) {
      bitField0_ |= 0x00000010;
      msgType = value.getNumber();
      return this;
    }

    /**
     * <code>optional string text = 9;</code>
     * @return whether the text field is set
     */
    public boolean hasText() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional string text = 9;</code>
     * @return this
     */
    public RevcMsgScNotify clearText() {
      bitField0_ &= ~0x00000020;
      text.clear();
      return this;
    }

    /**
     * <code>optional string text = 9;</code>
     * @return the text
     */
    public String getText() {
      return text.getString();
    }

    /**
     * <code>optional string text = 9;</code>
     * @return internal {@code Utf8String} representation of text for reading
     */
    public Utf8String getTextBytes() {
      return this.text;
    }

    /**
     * <code>optional string text = 9;</code>
     * @return internal {@code Utf8String} representation of text for modifications
     */
    public Utf8String getMutableTextBytes() {
      bitField0_ |= 0x00000020;
      return this.text;
    }

    /**
     * <code>optional string text = 9;</code>
     * @param value the text to set
     * @return this
     */
    public RevcMsgScNotify setText(final CharSequence value) {
      bitField0_ |= 0x00000020;
      text.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string text = 9;</code>
     * @param value the text to set
     * @return this
     */
    public RevcMsgScNotify setText(final Utf8String value) {
      bitField0_ |= 0x00000020;
      text.copyFrom(value);
      return this;
    }

    @Override
    public RevcMsgScNotify copyFrom(final RevcMsgScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        emote = other.emote;
        toUid = other.toUid;
        fromUid = other.fromUid;
        chatType = other.chatType;
        msgType = other.msgType;
        text.copyFrom(other.text);
      }
      return this;
    }

    @Override
    public RevcMsgScNotify mergeFrom(final RevcMsgScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEmote()) {
        setEmote(other.emote);
      }
      if (other.hasToUid()) {
        setToUid(other.toUid);
      }
      if (other.hasFromUid()) {
        setFromUid(other.fromUid);
      }
      if (other.hasChatType()) {
        setChatTypeValue(other.chatType);
      }
      if (other.hasMsgType()) {
        setMsgTypeValue(other.msgType);
      }
      if (other.hasText()) {
        getMutableTextBytes().copyFrom(other.text);
      }
      return this;
    }

    @Override
    public RevcMsgScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      emote = 0;
      toUid = 0;
      fromUid = 0;
      chatType = 0;
      msgType = 0;
      text.clear();
      return this;
    }

    @Override
    public RevcMsgScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      text.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RevcMsgScNotify)) {
        return false;
      }
      RevcMsgScNotify other = (RevcMsgScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasEmote() || emote == other.emote)
        && (!hasToUid() || toUid == other.toUid)
        && (!hasFromUid() || fromUid == other.fromUid)
        && (!hasChatType() || chatType == other.chatType)
        && (!hasMsgType() || msgType == other.msgType)
        && (!hasText() || text.equals(other.text));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(emote);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(toUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(fromUid);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 48);
        output.writeEnumNoTag(chatType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 120);
        output.writeEnumNoTag(msgType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 74);
        output.writeStringNoTag(text);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(emote);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(toUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(fromUid);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(chatType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(msgType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(text);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RevcMsgScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // emote
            emote = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // toUid
            toUid = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // fromUid
            fromUid = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // chatType
            final int value = input.readInt32();
            if (ChatTypeOuterClass.ChatType.forNumber(value) != null) {
              chatType = value;
              bitField0_ |= 0x00000008;
            }
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // msgType
            final int value = input.readInt32();
            if (MsgTypeOuterClass.MsgType.forNumber(value) != null) {
              msgType = value;
              bitField0_ |= 0x00000010;
            }
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // text
            input.readString(text);
            bitField0_ |= 0x00000020;
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
        output.writeUInt32(FieldNames.emote, emote);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.toUid, toUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.fromUid, fromUid);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeEnum(FieldNames.chatType, chatType, ChatTypeOuterClass.ChatType.converter());
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeEnum(FieldNames.msgType, msgType, MsgTypeOuterClass.MsgType.converter());
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeString(FieldNames.text, text);
      }
      output.endObject();
    }

    @Override
    public RevcMsgScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 96633208: {
            if (input.isAtField(FieldNames.emote)) {
              if (!input.trySkipNullValue()) {
                emote = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 110520277:
          case -868529012: {
            if (input.isAtField(FieldNames.toUid)) {
              if (!input.trySkipNullValue()) {
                toUid = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -594338746:
          case -1244322245: {
            if (input.isAtField(FieldNames.fromUid)) {
              if (!input.trySkipNullValue()) {
                fromUid = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1437412018:
          case 1620118465: {
            if (input.isAtField(FieldNames.chatType)) {
              if (!input.trySkipNullValue()) {
                final ChatTypeOuterClass.ChatType value = input.readEnum(ChatTypeOuterClass.ChatType.converter());
                if (value != null) {
                  chatType = value.getNumber();
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
          case 1343750747:
          case -1283380936: {
            if (input.isAtField(FieldNames.msgType)) {
              if (!input.trySkipNullValue()) {
                final MsgTypeOuterClass.MsgType value = input.readEnum(MsgTypeOuterClass.MsgType.converter());
                if (value != null) {
                  msgType = value.getNumber();
                  bitField0_ |= 0x00000010;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3556653: {
            if (input.isAtField(FieldNames.text)) {
              if (!input.trySkipNullValue()) {
                input.readString(text);
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
    public RevcMsgScNotify clone() {
      return new RevcMsgScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RevcMsgScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RevcMsgScNotify(), data).checkInitialized();
    }

    public static RevcMsgScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RevcMsgScNotify(), input).checkInitialized();
    }

    public static RevcMsgScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RevcMsgScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating RevcMsgScNotify messages
     */
    public static MessageFactory<RevcMsgScNotify> getFactory() {
      return RevcMsgScNotifyFactory.INSTANCE;
    }

    private enum RevcMsgScNotifyFactory implements MessageFactory<RevcMsgScNotify> {
      INSTANCE;

      @Override
      public RevcMsgScNotify create() {
        return RevcMsgScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName emote = FieldName.forField("emote");

      static final FieldName toUid = FieldName.forField("toUid", "to_uid");

      static final FieldName fromUid = FieldName.forField("fromUid", "from_uid");

      static final FieldName chatType = FieldName.forField("chatType", "chat_type");

      static final FieldName msgType = FieldName.forField("msgType", "msg_type");

      static final FieldName text = FieldName.forField("text");
    }
  }
}
