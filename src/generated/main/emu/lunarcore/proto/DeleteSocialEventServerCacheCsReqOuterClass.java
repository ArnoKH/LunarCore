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

public final class DeleteSocialEventServerCacheCsReqOuterClass {
  /**
   * Protobuf type {@code DeleteSocialEventServerCacheCsReq}
   */
  public static final class DeleteSocialEventServerCacheCsReq extends ProtoMessage<DeleteSocialEventServerCacheCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 delete_cache = 9;</code>
     */
    private final RepeatedInt deleteCache = RepeatedInt.newEmptyInstance();

    private DeleteSocialEventServerCacheCsReq() {
    }

    /**
     * @return a new empty instance of {@code DeleteSocialEventServerCacheCsReq}
     */
    public static DeleteSocialEventServerCacheCsReq newInstance() {
      return new DeleteSocialEventServerCacheCsReq();
    }

    /**
     * <code>repeated uint32 delete_cache = 9;</code>
     * @return whether the deleteCache field is set
     */
    public boolean hasDeleteCache() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 delete_cache = 9;</code>
     * @return this
     */
    public DeleteSocialEventServerCacheCsReq clearDeleteCache() {
      bitField0_ &= ~0x00000001;
      deleteCache.clear();
      return this;
    }

    /**
     * <code>repeated uint32 delete_cache = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDeleteCache()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getDeleteCache() {
      return deleteCache;
    }

    /**
     * <code>repeated uint32 delete_cache = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableDeleteCache() {
      bitField0_ |= 0x00000001;
      return deleteCache;
    }

    /**
     * <code>repeated uint32 delete_cache = 9;</code>
     * @param value the deleteCache to add
     * @return this
     */
    public DeleteSocialEventServerCacheCsReq addDeleteCache(final int value) {
      bitField0_ |= 0x00000001;
      deleteCache.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 delete_cache = 9;</code>
     * @param values the deleteCache to add
     * @return this
     */
    public DeleteSocialEventServerCacheCsReq addAllDeleteCache(final int... values) {
      bitField0_ |= 0x00000001;
      deleteCache.addAll(values);
      return this;
    }

    @Override
    public DeleteSocialEventServerCacheCsReq copyFrom(
        final DeleteSocialEventServerCacheCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        deleteCache.copyFrom(other.deleteCache);
      }
      return this;
    }

    @Override
    public DeleteSocialEventServerCacheCsReq mergeFrom(
        final DeleteSocialEventServerCacheCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDeleteCache()) {
        getMutableDeleteCache().addAll(other.deleteCache);
      }
      return this;
    }

    @Override
    public DeleteSocialEventServerCacheCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      deleteCache.clear();
      return this;
    }

    @Override
    public DeleteSocialEventServerCacheCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      deleteCache.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DeleteSocialEventServerCacheCsReq)) {
        return false;
      }
      DeleteSocialEventServerCacheCsReq other = (DeleteSocialEventServerCacheCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasDeleteCache() || deleteCache.equals(other.deleteCache));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < deleteCache.length(); i++) {
          output.writeRawByte((byte) 72);
          output.writeUInt32NoTag(deleteCache.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * deleteCache.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(deleteCache);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DeleteSocialEventServerCacheCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 74: {
            // deleteCache [packed=true]
            input.readPackedUInt32(deleteCache, tag);
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
          case 72: {
            // deleteCache [packed=false]
            tag = input.readRepeatedUInt32(deleteCache, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.deleteCache, deleteCache);
      }
      output.endObject();
    }

    @Override
    public DeleteSocialEventServerCacheCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1148253033:
          case -432706578: {
            if (input.isAtField(FieldNames.deleteCache)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(deleteCache);
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
    public DeleteSocialEventServerCacheCsReq clone() {
      return new DeleteSocialEventServerCacheCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DeleteSocialEventServerCacheCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DeleteSocialEventServerCacheCsReq(), data).checkInitialized();
    }

    public static DeleteSocialEventServerCacheCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new DeleteSocialEventServerCacheCsReq(), input).checkInitialized();
    }

    public static DeleteSocialEventServerCacheCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new DeleteSocialEventServerCacheCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating DeleteSocialEventServerCacheCsReq messages
     */
    public static MessageFactory<DeleteSocialEventServerCacheCsReq> getFactory() {
      return DeleteSocialEventServerCacheCsReqFactory.INSTANCE;
    }

    private enum DeleteSocialEventServerCacheCsReqFactory implements MessageFactory<DeleteSocialEventServerCacheCsReq> {
      INSTANCE;

      @Override
      public DeleteSocialEventServerCacheCsReq create() {
        return DeleteSocialEventServerCacheCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName deleteCache = FieldName.forField("deleteCache", "delete_cache");
    }
  }
}
