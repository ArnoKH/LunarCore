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

public final class ApplyFriendCsReqOuterClass {
  /**
   * Protobuf type {@code ApplyFriendCsReq}
   */
  public static final class ApplyFriendCsReq extends ProtoMessage<ApplyFriendCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 uid = 7;</code>
     */
    private int uid;

    /**
     * <code>optional .FriendApplySource source = 5;</code>
     */
    private int source;

    private ApplyFriendCsReq() {
    }

    /**
     * @return a new empty instance of {@code ApplyFriendCsReq}
     */
    public static ApplyFriendCsReq newInstance() {
      return new ApplyFriendCsReq();
    }

    /**
     * <code>optional uint32 uid = 7;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 uid = 7;</code>
     * @return this
     */
    public ApplyFriendCsReq clearUid() {
      bitField0_ &= ~0x00000001;
      uid = 0;
      return this;
    }

    /**
     * <code>optional uint32 uid = 7;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <code>optional uint32 uid = 7;</code>
     * @param value the uid to set
     * @return this
     */
    public ApplyFriendCsReq setUid(final int value) {
      bitField0_ |= 0x00000001;
      uid = value;
      return this;
    }

    /**
     * <code>optional .FriendApplySource source = 5;</code>
     * @return whether the source field is set
     */
    public boolean hasSource() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .FriendApplySource source = 5;</code>
     * @return this
     */
    public ApplyFriendCsReq clearSource() {
      bitField0_ &= ~0x00000002;
      source = 0;
      return this;
    }

    /**
     * <code>optional .FriendApplySource source = 5;</code>
     * @return the source
     */
    public FriendApplySourceOuterClass.FriendApplySource getSource() {
      return FriendApplySourceOuterClass.FriendApplySource.forNumber(source);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link ApplyFriendCsReq#getSource()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getSourceValue() {
      return source;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link FriendApplySourceOuterClass.FriendApplySource}. Setting an invalid value
     * can cause {@link ApplyFriendCsReq#getSource()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public ApplyFriendCsReq setSourceValue(final int value) {
      bitField0_ |= 0x00000002;
      source = value;
      return this;
    }

    /**
     * <code>optional .FriendApplySource source = 5;</code>
     * @param value the source to set
     * @return this
     */
    public ApplyFriendCsReq setSource(final FriendApplySourceOuterClass.FriendApplySource value) {
      bitField0_ |= 0x00000002;
      source = value.getNumber();
      return this;
    }

    @Override
    public ApplyFriendCsReq copyFrom(final ApplyFriendCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        uid = other.uid;
        source = other.source;
      }
      return this;
    }

    @Override
    public ApplyFriendCsReq mergeFrom(final ApplyFriendCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUid()) {
        setUid(other.uid);
      }
      if (other.hasSource()) {
        setSourceValue(other.source);
      }
      return this;
    }

    @Override
    public ApplyFriendCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      uid = 0;
      source = 0;
      return this;
    }

    @Override
    public ApplyFriendCsReq clearQuick() {
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
      if (!(o instanceof ApplyFriendCsReq)) {
        return false;
      }
      ApplyFriendCsReq other = (ApplyFriendCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasUid() || uid == other.uid)
        && (!hasSource() || source == other.source);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeEnumNoTag(source);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(source);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ApplyFriendCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // uid
            uid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // source
            final int value = input.readInt32();
            if (FriendApplySourceOuterClass.FriendApplySource.forNumber(value) != null) {
              source = value;
              bitField0_ |= 0x00000002;
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
        output.writeEnum(FieldNames.source, source, FriendApplySourceOuterClass.FriendApplySource.converter());
      }
      output.endObject();
    }

    @Override
    public ApplyFriendCsReq mergeFrom(final JsonSource input) throws IOException {
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
          case -896505829: {
            if (input.isAtField(FieldNames.source)) {
              if (!input.trySkipNullValue()) {
                final FriendApplySourceOuterClass.FriendApplySource value = input.readEnum(FriendApplySourceOuterClass.FriendApplySource.converter());
                if (value != null) {
                  source = value.getNumber();
                  bitField0_ |= 0x00000002;
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
    public ApplyFriendCsReq clone() {
      return new ApplyFriendCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ApplyFriendCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ApplyFriendCsReq(), data).checkInitialized();
    }

    public static ApplyFriendCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ApplyFriendCsReq(), input).checkInitialized();
    }

    public static ApplyFriendCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ApplyFriendCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ApplyFriendCsReq messages
     */
    public static MessageFactory<ApplyFriendCsReq> getFactory() {
      return ApplyFriendCsReqFactory.INSTANCE;
    }

    private enum ApplyFriendCsReqFactory implements MessageFactory<ApplyFriendCsReq> {
      INSTANCE;

      @Override
      public ApplyFriendCsReq create() {
        return ApplyFriendCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName uid = FieldName.forField("uid");

      static final FieldName source = FieldName.forField("source");
    }
  }
}
