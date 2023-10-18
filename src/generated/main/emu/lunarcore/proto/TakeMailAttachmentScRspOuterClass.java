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

public final class TakeMailAttachmentScRspOuterClass {
  /**
   * Protobuf type {@code TakeMailAttachmentScRsp}
   */
  public static final class TakeMailAttachmentScRsp extends ProtoMessage<TakeMailAttachmentScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional .ItemList attachment = 10;</code>
     */
    private final ItemListOuterClass.ItemList attachment = ItemListOuterClass.ItemList.newInstance();

    /**
     * <code>repeated uint32 succ_mail_id_list = 6;</code>
     */
    private final RepeatedInt succMailIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .ClientMailAttachmentItem fail_mail_list = 13;</code>
     */
    private final RepeatedMessage<ClientMailAttachmentItemOuterClass.ClientMailAttachmentItem> failMailList = RepeatedMessage.newEmptyInstance(ClientMailAttachmentItemOuterClass.ClientMailAttachmentItem.getFactory());

    private TakeMailAttachmentScRsp() {
    }

    /**
     * @return a new empty instance of {@code TakeMailAttachmentScRsp}
     */
    public static TakeMailAttachmentScRsp newInstance() {
      return new TakeMailAttachmentScRsp();
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public TakeMailAttachmentScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public TakeMailAttachmentScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ItemList attachment = 10;</code>
     * @return whether the attachment field is set
     */
    public boolean hasAttachment() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ItemList attachment = 10;</code>
     * @return this
     */
    public TakeMailAttachmentScRsp clearAttachment() {
      bitField0_ &= ~0x00000002;
      attachment.clear();
      return this;
    }

    /**
     * <code>optional .ItemList attachment = 10;</code>
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
     * <code>optional .ItemList attachment = 10;</code>
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
     * <code>optional .ItemList attachment = 10;</code>
     * @param value the attachment to set
     * @return this
     */
    public TakeMailAttachmentScRsp setAttachment(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000002;
      attachment.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 6;</code>
     * @return whether the succMailIdList field is set
     */
    public boolean hasSuccMailIdList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 6;</code>
     * @return this
     */
    public TakeMailAttachmentScRsp clearSuccMailIdList() {
      bitField0_ &= ~0x00000004;
      succMailIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 6;</code>
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
     * <code>repeated uint32 succ_mail_id_list = 6;</code>
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
     * <code>repeated uint32 succ_mail_id_list = 6;</code>
     * @param value the succMailIdList to add
     * @return this
     */
    public TakeMailAttachmentScRsp addSuccMailIdList(final int value) {
      bitField0_ |= 0x00000004;
      succMailIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 succ_mail_id_list = 6;</code>
     * @param values the succMailIdList to add
     * @return this
     */
    public TakeMailAttachmentScRsp addAllSuccMailIdList(final int... values) {
      bitField0_ |= 0x00000004;
      succMailIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .ClientMailAttachmentItem fail_mail_list = 13;</code>
     * @return whether the failMailList field is set
     */
    public boolean hasFailMailList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .ClientMailAttachmentItem fail_mail_list = 13;</code>
     * @return this
     */
    public TakeMailAttachmentScRsp clearFailMailList() {
      bitField0_ &= ~0x00000008;
      failMailList.clear();
      return this;
    }

    /**
     * <code>repeated .ClientMailAttachmentItem fail_mail_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFailMailList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ClientMailAttachmentItemOuterClass.ClientMailAttachmentItem> getFailMailList(
        ) {
      return failMailList;
    }

    /**
     * <code>repeated .ClientMailAttachmentItem fail_mail_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ClientMailAttachmentItemOuterClass.ClientMailAttachmentItem> getMutableFailMailList(
        ) {
      bitField0_ |= 0x00000008;
      return failMailList;
    }

    /**
     * <code>repeated .ClientMailAttachmentItem fail_mail_list = 13;</code>
     * @param value the failMailList to add
     * @return this
     */
    public TakeMailAttachmentScRsp addFailMailList(
        final ClientMailAttachmentItemOuterClass.ClientMailAttachmentItem value) {
      bitField0_ |= 0x00000008;
      failMailList.add(value);
      return this;
    }

    /**
     * <code>repeated .ClientMailAttachmentItem fail_mail_list = 13;</code>
     * @param values the failMailList to add
     * @return this
     */
    public TakeMailAttachmentScRsp addAllFailMailList(
        final ClientMailAttachmentItemOuterClass.ClientMailAttachmentItem... values) {
      bitField0_ |= 0x00000008;
      failMailList.addAll(values);
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
        failMailList.copyFrom(other.failMailList);
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
      if (other.hasFailMailList()) {
        getMutableFailMailList().addAll(other.failMailList);
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
      failMailList.clear();
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
      failMailList.clearQuick();
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
        && (!hasSuccMailIdList() || succMailIdList.equals(other.succMailIdList))
        && (!hasFailMailList() || failMailList.equals(other.failMailList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(attachment);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < succMailIdList.length(); i++) {
          output.writeRawByte((byte) 48);
          output.writeUInt32NoTag(succMailIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < failMailList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(failMailList.get(i));
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
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * failMailList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(failMailList);
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
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // attachment
            input.readMessage(attachment);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // succMailIdList [packed=true]
            input.readPackedUInt32(succMailIdList, tag);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // failMailList
            tag = input.readRepeatedMessage(failMailList, tag);
            bitField0_ |= 0x00000008;
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
          case 48: {
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
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.failMailList, failMailList);
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
          case 1034400819:
          case -348560827: {
            if (input.isAtField(FieldNames.failMailList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(failMailList);
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

      static final FieldName failMailList = FieldName.forField("failMailList", "fail_mail_list");
    }
  }
}
