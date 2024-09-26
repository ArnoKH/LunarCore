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

public final class TakeMailAttachmentScRspOuterClass {
  /**
   * Protobuf type {@code TakeMailAttachmentScRsp}
   */
  public static final class TakeMailAttachmentScRsp extends ProtoMessage<TakeMailAttachmentScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    /**
     * <code>optional .ItemList attachment = 14;</code>
     */
    private final ItemListOuterClass.ItemList attachment = ItemListOuterClass.ItemList.newInstance();

    /**
     * <code>repeated uint32 succ_mail_id_list = 12;</code>
     */
    private final RepeatedInt succMailIdList = RepeatedInt.newEmptyInstance();

    private TakeMailAttachmentScRsp() {
    }

    /**
     * @return a new empty instance of {@code TakeMailAttachmentScRsp}
     */
    public static TakeMailAttachmentScRsp newInstance() {
      return new TakeMailAttachmentScRsp();
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public TakeMailAttachmentScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public TakeMailAttachmentScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ItemList attachment = 14;</code>
     * @return whether the attachment field is set
     */
    public boolean hasAttachment() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ItemList attachment = 14;</code>
     * @return this
     */
    public TakeMailAttachmentScRsp clearAttachment() {
      bitField0_ &= ~0x00000002;
      attachment.clear();
      return this;
    }

    /**
     * <code>optional .ItemList attachment = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAttachment()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getAttachment() {
      return attachment;
    }

    /**
     * <code>optional .ItemList attachment = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableAttachment() {
      bitField0_ |= 0x00000002;
      return attachment;
    }

    /**
     * <code>optional .ItemList attachment = 14;</code>
     * @param value the attachment to set
     * @return this
     */
    public TakeMailAttachmentScRsp setAttachment(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000002;
      attachment.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 12;</code>
     * @return whether the succMailIdList field is set
     */
    public boolean hasSuccMailIdList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 12;</code>
     * @return this
     */
    public TakeMailAttachmentScRsp clearSuccMailIdList() {
      bitField0_ &= ~0x00000004;
      succMailIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSuccMailIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getSuccMailIdList() {
      return succMailIdList;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableSuccMailIdList() {
      bitField0_ |= 0x00000004;
      return succMailIdList;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 12;</code>
     * @param value the succMailIdList to add
     * @return this
     */
    public TakeMailAttachmentScRsp addSuccMailIdList(final int value) {
      bitField0_ |= 0x00000004;
      succMailIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 12;</code>
     * @param values the succMailIdList to add
     * @return this
     */
    public TakeMailAttachmentScRsp addAllSuccMailIdList(final int... values) {
      bitField0_ |= 0x00000004;
      succMailIdList.addAll(values);
      return this;
    }

    @Override
    public TakeMailAttachmentScRsp copyFrom(final TakeMailAttachmentScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        attachment.copyFrom(other.attachment);
        succMailIdList.copyFrom(other.succMailIdList);
      }
      return this;
    }

    @Override
    public TakeMailAttachmentScRsp mergeFrom(final TakeMailAttachmentScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasAttachment()) {
        getMutableAttachment().mergeFrom(other.attachment);
      }
      if (other.hasSuccMailIdList()) {
        getMutableSuccMailIdList().addAll(other.succMailIdList);
      }
      return this;
    }

    @Override
    public TakeMailAttachmentScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      attachment.clear();
      succMailIdList.clear();
      return this;
    }

    @Override
    public TakeMailAttachmentScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      attachment.clearQuick();
      succMailIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TakeMailAttachmentScRsp)) {
        return false;
      }
      TakeMailAttachmentScRsp other = (TakeMailAttachmentScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasAttachment() || attachment.equals(other.attachment))
        && (!hasSuccMailIdList() || succMailIdList.equals(other.succMailIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(attachment);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < succMailIdList.length(); i++) {
          output.writeRawByte((byte) 96);
          output.writeUInt32NoTag(succMailIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(attachment);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * succMailIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(succMailIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public TakeMailAttachmentScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // attachment
            input.readMessage(attachment);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // succMailIdList [packed=true]
            input.readPackedUInt32(succMailIdList, tag);
            bitField0_ |= 0x00000004;
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
          case 96: {
            // succMailIdList [packed=false]
            tag = input.readRepeatedUInt32(succMailIdList, tag);
            bitField0_ |= 0x00000004;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.attachment, attachment);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.succMailIdList, succMailIdList);
      }
      output.endObject();
    }

    @Override
    public TakeMailAttachmentScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1963501277: {
            if (input.isAtField(FieldNames.attachment)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(attachment);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 492844242:
          case 1318122903: {
            if (input.isAtField(FieldNames.succMailIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(succMailIdList);
                bitField0_ |= 0x00000004;
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
    public TakeMailAttachmentScRsp clone() {
      return new TakeMailAttachmentScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static TakeMailAttachmentScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new TakeMailAttachmentScRsp(), data).checkInitialized();
    }

    public static TakeMailAttachmentScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeMailAttachmentScRsp(), input).checkInitialized();
    }

    public static TakeMailAttachmentScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeMailAttachmentScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating TakeMailAttachmentScRsp messages
     */
    public static MessageFactory<TakeMailAttachmentScRsp> getFactory() {
      return TakeMailAttachmentScRspFactory.INSTANCE;
    }

    private enum TakeMailAttachmentScRspFactory implements MessageFactory<TakeMailAttachmentScRsp> {
      INSTANCE;

      @Override
      public TakeMailAttachmentScRsp create() {
        return TakeMailAttachmentScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName attachment = FieldName.forField("attachment");

      static final FieldName succMailIdList = FieldName.forField("succMailIdList", "succ_mail_id_list");
    }
  }
}
