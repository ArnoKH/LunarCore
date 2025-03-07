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

public final class RecallPetScRspOuterClass {
  /**
   * Protobuf type {@code RecallPetScRsp}
   */
  public static final class RecallPetScRsp extends ProtoMessage<RecallPetScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 BMCOIJCMNNC = 7;</code>
     */
    private int bMCOIJCMNNC;

    /**
     * <code>optional uint32 cur_pet_id = 13;</code>
     */
    private int curPetId;

    /**
     * <code>optional uint32 retcode = 14;</code>
     */
    private int retcode;

    private RecallPetScRsp() {
    }

    /**
     * @return a new empty instance of {@code RecallPetScRsp}
     */
    public static RecallPetScRsp newInstance() {
      return new RecallPetScRsp();
    }

    /**
     * <code>optional uint32 BMCOIJCMNNC = 7;</code>
     * @return whether the bMCOIJCMNNC field is set
     */
    public boolean hasBMCOIJCMNNC() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 BMCOIJCMNNC = 7;</code>
     * @return this
     */
    public RecallPetScRsp clearBMCOIJCMNNC() {
      bitField0_ &= ~0x00000001;
      bMCOIJCMNNC = 0;
      return this;
    }

    /**
     * <code>optional uint32 BMCOIJCMNNC = 7;</code>
     * @return the bMCOIJCMNNC
     */
    public int getBMCOIJCMNNC() {
      return bMCOIJCMNNC;
    }

    /**
     * <code>optional uint32 BMCOIJCMNNC = 7;</code>
     * @param value the bMCOIJCMNNC to set
     * @return this
     */
    public RecallPetScRsp setBMCOIJCMNNC(final int value) {
      bitField0_ |= 0x00000001;
      bMCOIJCMNNC = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_pet_id = 13;</code>
     * @return whether the curPetId field is set
     */
    public boolean hasCurPetId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 cur_pet_id = 13;</code>
     * @return this
     */
    public RecallPetScRsp clearCurPetId() {
      bitField0_ &= ~0x00000002;
      curPetId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_pet_id = 13;</code>
     * @return the curPetId
     */
    public int getCurPetId() {
      return curPetId;
    }

    /**
     * <code>optional uint32 cur_pet_id = 13;</code>
     * @param value the curPetId to set
     * @return this
     */
    public RecallPetScRsp setCurPetId(final int value) {
      bitField0_ |= 0x00000002;
      curPetId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return this
     */
    public RecallPetScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @param value the retcode to set
     * @return this
     */
    public RecallPetScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    @Override
    public RecallPetScRsp copyFrom(final RecallPetScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        bMCOIJCMNNC = other.bMCOIJCMNNC;
        curPetId = other.curPetId;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public RecallPetScRsp mergeFrom(final RecallPetScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBMCOIJCMNNC()) {
        setBMCOIJCMNNC(other.bMCOIJCMNNC);
      }
      if (other.hasCurPetId()) {
        setCurPetId(other.curPetId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public RecallPetScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      bMCOIJCMNNC = 0;
      curPetId = 0;
      retcode = 0;
      return this;
    }

    @Override
    public RecallPetScRsp clearQuick() {
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
      if (!(o instanceof RecallPetScRsp)) {
        return false;
      }
      RecallPetScRsp other = (RecallPetScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasBMCOIJCMNNC() || bMCOIJCMNNC == other.bMCOIJCMNNC)
        && (!hasCurPetId() || curPetId == other.curPetId)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(bMCOIJCMNNC);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(curPetId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bMCOIJCMNNC);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curPetId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RecallPetScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // bMCOIJCMNNC
            bMCOIJCMNNC = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // curPetId
            curPetId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // retcode
            retcode = input.readUInt32();
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.bMCOIJCMNNC, bMCOIJCMNNC);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.curPetId, curPetId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public RecallPetScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1362418561: {
            if (input.isAtField(FieldNames.bMCOIJCMNNC)) {
              if (!input.trySkipNullValue()) {
                bMCOIJCMNNC = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 544007226:
          case -465065190: {
            if (input.isAtField(FieldNames.curPetId)) {
              if (!input.trySkipNullValue()) {
                curPetId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
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
    public RecallPetScRsp clone() {
      return new RecallPetScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RecallPetScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RecallPetScRsp(), data).checkInitialized();
    }

    public static RecallPetScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RecallPetScRsp(), input).checkInitialized();
    }

    public static RecallPetScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RecallPetScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating RecallPetScRsp messages
     */
    public static MessageFactory<RecallPetScRsp> getFactory() {
      return RecallPetScRspFactory.INSTANCE;
    }

    private enum RecallPetScRspFactory implements MessageFactory<RecallPetScRsp> {
      INSTANCE;

      @Override
      public RecallPetScRsp create() {
        return RecallPetScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName bMCOIJCMNNC = FieldName.forField("BMCOIJCMNNC");

      static final FieldName curPetId = FieldName.forField("curPetId", "cur_pet_id");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
