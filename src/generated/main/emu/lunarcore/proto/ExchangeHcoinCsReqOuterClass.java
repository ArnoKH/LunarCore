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

public final class ExchangeHcoinCsReqOuterClass {
  /**
   * Protobuf type {@code ExchangeHcoinCsReq}
   */
  public static final class ExchangeHcoinCsReq extends ProtoMessage<ExchangeHcoinCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 num = 14;</code>
     */
    private int num;

    private ExchangeHcoinCsReq() {
    }

    /**
     * @return a new empty instance of {@code ExchangeHcoinCsReq}
     */
    public static ExchangeHcoinCsReq newInstance() {
      return new ExchangeHcoinCsReq();
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return whether the num field is set
     */
    public boolean hasNum() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return this
     */
    public ExchangeHcoinCsReq clearNum() {
      bitField0_ &= ~0x00000001;
      num = 0;
      return this;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return the num
     */
    public int getNum() {
      return num;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @param value the num to set
     * @return this
     */
    public ExchangeHcoinCsReq setNum(final int value) {
      bitField0_ |= 0x00000001;
      num = value;
      return this;
    }

    @Override
    public ExchangeHcoinCsReq copyFrom(final ExchangeHcoinCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        num = other.num;
      }
      return this;
    }

    @Override
    public ExchangeHcoinCsReq mergeFrom(final ExchangeHcoinCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNum()) {
        setNum(other.num);
      }
      return this;
    }

    @Override
    public ExchangeHcoinCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      num = 0;
      return this;
    }

    @Override
    public ExchangeHcoinCsReq clearQuick() {
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
      if (!(o instanceof ExchangeHcoinCsReq)) {
        return false;
      }
      ExchangeHcoinCsReq other = (ExchangeHcoinCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasNum() || num == other.num);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(num);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(num);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ExchangeHcoinCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // num
            num = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.num, num);
      }
      output.endObject();
    }

    @Override
    public ExchangeHcoinCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109446: {
            if (input.isAtField(FieldNames.num)) {
              if (!input.trySkipNullValue()) {
                num = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public ExchangeHcoinCsReq clone() {
      return new ExchangeHcoinCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ExchangeHcoinCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ExchangeHcoinCsReq(), data).checkInitialized();
    }

    public static ExchangeHcoinCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExchangeHcoinCsReq(), input).checkInitialized();
    }

    public static ExchangeHcoinCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExchangeHcoinCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ExchangeHcoinCsReq messages
     */
    public static MessageFactory<ExchangeHcoinCsReq> getFactory() {
      return ExchangeHcoinCsReqFactory.INSTANCE;
    }

    private enum ExchangeHcoinCsReqFactory implements MessageFactory<ExchangeHcoinCsReq> {
      INSTANCE;

      @Override
      public ExchangeHcoinCsReq create() {
        return ExchangeHcoinCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName num = FieldName.forField("num");
    }
  }
}
