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

public final class UpdateServerPrefsDataCsReqOuterClass {
  /**
   * Protobuf type {@code UpdateServerPrefsDataCsReq}
   */
  public static final class UpdateServerPrefsDataCsReq extends ProtoMessage<UpdateServerPrefsDataCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .ServerPrefs server_prefs = 5;</code>
     */
    private final ServerPrefsOuterClass.ServerPrefs serverPrefs = ServerPrefsOuterClass.ServerPrefs.newInstance();

    private UpdateServerPrefsDataCsReq() {
    }

    /**
     * @return a new empty instance of {@code UpdateServerPrefsDataCsReq}
     */
    public static UpdateServerPrefsDataCsReq newInstance() {
      return new UpdateServerPrefsDataCsReq();
    }

    /**
     * <code>optional .ServerPrefs server_prefs = 5;</code>
     * @return whether the serverPrefs field is set
     */
    public boolean hasServerPrefs() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .ServerPrefs server_prefs = 5;</code>
     * @return this
     */
    public UpdateServerPrefsDataCsReq clearServerPrefs() {
      bitField0_ &= ~0x00000001;
      serverPrefs.clear();
      return this;
    }

    /**
     * <code>optional .ServerPrefs server_prefs = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableServerPrefs()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ServerPrefsOuterClass.ServerPrefs getServerPrefs() {
      return serverPrefs;
    }

    /**
     * <code>optional .ServerPrefs server_prefs = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ServerPrefsOuterClass.ServerPrefs getMutableServerPrefs() {
      bitField0_ |= 0x00000001;
      return serverPrefs;
    }

    /**
     * <code>optional .ServerPrefs server_prefs = 5;</code>
     * @param value the serverPrefs to set
     * @return this
     */
    public UpdateServerPrefsDataCsReq setServerPrefs(
        final ServerPrefsOuterClass.ServerPrefs value) {
      bitField0_ |= 0x00000001;
      serverPrefs.copyFrom(value);
      return this;
    }

    @Override
    public UpdateServerPrefsDataCsReq copyFrom(final UpdateServerPrefsDataCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        serverPrefs.copyFrom(other.serverPrefs);
      }
      return this;
    }

    @Override
    public UpdateServerPrefsDataCsReq mergeFrom(final UpdateServerPrefsDataCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasServerPrefs()) {
        getMutableServerPrefs().mergeFrom(other.serverPrefs);
      }
      return this;
    }

    @Override
    public UpdateServerPrefsDataCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      serverPrefs.clear();
      return this;
    }

    @Override
    public UpdateServerPrefsDataCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      serverPrefs.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof UpdateServerPrefsDataCsReq)) {
        return false;
      }
      UpdateServerPrefsDataCsReq other = (UpdateServerPrefsDataCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasServerPrefs() || serverPrefs.equals(other.serverPrefs));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(serverPrefs);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(serverPrefs);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UpdateServerPrefsDataCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 42: {
            // serverPrefs
            input.readMessage(serverPrefs);
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
        output.writeMessage(FieldNames.serverPrefs, serverPrefs);
      }
      output.endObject();
    }

    @Override
    public UpdateServerPrefsDataCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -772500179:
          case -2044692812: {
            if (input.isAtField(FieldNames.serverPrefs)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(serverPrefs);
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
    public UpdateServerPrefsDataCsReq clone() {
      return new UpdateServerPrefsDataCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UpdateServerPrefsDataCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UpdateServerPrefsDataCsReq(), data).checkInitialized();
    }

    public static UpdateServerPrefsDataCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UpdateServerPrefsDataCsReq(), input).checkInitialized();
    }

    public static UpdateServerPrefsDataCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UpdateServerPrefsDataCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating UpdateServerPrefsDataCsReq messages
     */
    public static MessageFactory<UpdateServerPrefsDataCsReq> getFactory() {
      return UpdateServerPrefsDataCsReqFactory.INSTANCE;
    }

    private enum UpdateServerPrefsDataCsReqFactory implements MessageFactory<UpdateServerPrefsDataCsReq> {
      INSTANCE;

      @Override
      public UpdateServerPrefsDataCsReq create() {
        return UpdateServerPrefsDataCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName serverPrefs = FieldName.forField("serverPrefs", "server_prefs");
    }
  }
}
