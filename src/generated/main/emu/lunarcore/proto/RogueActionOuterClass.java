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

public final class RogueActionOuterClass {
  /**
   * Protobuf type {@code RogueAction}
   */
  public static final class RogueAction extends ProtoMessage<RogueAction> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  REMOVED???
     * </pre>
     *
     * <code>optional .RogueMiracleSelectInfo miracle_select_info = 338;</code>
     */
    private final RogueMiracleSelectInfoOuterClass.RogueMiracleSelectInfo miracleSelectInfo = RogueMiracleSelectInfoOuterClass.RogueMiracleSelectInfo.newInstance();

    /**
     * <code>optional .RogueBonusSelectInfo bonus_select_info = 1035;</code>
     */
    private final RogueBonusSelectInfoOuterClass.RogueBonusSelectInfo bonusSelectInfo = RogueBonusSelectInfoOuterClass.RogueBonusSelectInfo.newInstance();

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 1903;</code>
     */
    private final RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo buffSelectInfo = RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo.newInstance();

    private RogueAction() {
    }

    /**
     * @return a new empty instance of {@code RogueAction}
     */
    public static RogueAction newInstance() {
      return new RogueAction();
    }

    public boolean hasAction() {
      return (((bitField0_ & 0x00000007)) != 0);
    }

    public RogueAction clearAction() {
      if (hasAction()) {
        clearMiracleSelectInfo();
        clearBonusSelectInfo();
        clearBuffSelectInfo();
      }
      return this;
    }

    private void clearActionOtherMiracleSelectInfo() {
      if ((((bitField0_ & 0x00000006)) != 0)) {
        clearBonusSelectInfo();
        clearBuffSelectInfo();
      }
    }

    private void clearActionOtherBonusSelectInfo() {
      if ((((bitField0_ & 0x00000005)) != 0)) {
        clearMiracleSelectInfo();
        clearBuffSelectInfo();
      }
    }

    private void clearActionOtherBuffSelectInfo() {
      if ((((bitField0_ & 0x00000003)) != 0)) {
        clearMiracleSelectInfo();
        clearBonusSelectInfo();
      }
    }

    /**
     * <pre>
     *  REMOVED???
     * </pre>
     *
     * <code>optional .RogueMiracleSelectInfo miracle_select_info = 338;</code>
     * @return whether the miracleSelectInfo field is set
     */
    public boolean hasMiracleSelectInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  REMOVED???
     * </pre>
     *
     * <code>optional .RogueMiracleSelectInfo miracle_select_info = 338;</code>
     * @return this
     */
    public RogueAction clearMiracleSelectInfo() {
      bitField0_ &= ~0x00000001;
      miracleSelectInfo.clear();
      return this;
    }

    /**
     * <pre>
     *  REMOVED???
     * </pre>
     *
     * <code>optional .RogueMiracleSelectInfo miracle_select_info = 338;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMiracleSelectInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueMiracleSelectInfoOuterClass.RogueMiracleSelectInfo getMiracleSelectInfo() {
      return miracleSelectInfo;
    }

    /**
     * <pre>
     *  REMOVED???
     * </pre>
     *
     * <code>optional .RogueMiracleSelectInfo miracle_select_info = 338;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueMiracleSelectInfoOuterClass.RogueMiracleSelectInfo getMutableMiracleSelectInfo() {
      clearActionOtherMiracleSelectInfo();
      bitField0_ |= 0x00000001;
      return miracleSelectInfo;
    }

    /**
     * <pre>
     *  REMOVED???
     * </pre>
     *
     * <code>optional .RogueMiracleSelectInfo miracle_select_info = 338;</code>
     * @param value the miracleSelectInfo to set
     * @return this
     */
    public RogueAction setMiracleSelectInfo(
        final RogueMiracleSelectInfoOuterClass.RogueMiracleSelectInfo value) {
      clearActionOtherMiracleSelectInfo();
      bitField0_ |= 0x00000001;
      miracleSelectInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueBonusSelectInfo bonus_select_info = 1035;</code>
     * @return whether the bonusSelectInfo field is set
     */
    public boolean hasBonusSelectInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueBonusSelectInfo bonus_select_info = 1035;</code>
     * @return this
     */
    public RogueAction clearBonusSelectInfo() {
      bitField0_ &= ~0x00000002;
      bonusSelectInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueBonusSelectInfo bonus_select_info = 1035;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBonusSelectInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBonusSelectInfoOuterClass.RogueBonusSelectInfo getBonusSelectInfo() {
      return bonusSelectInfo;
    }

    /**
     * <code>optional .RogueBonusSelectInfo bonus_select_info = 1035;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBonusSelectInfoOuterClass.RogueBonusSelectInfo getMutableBonusSelectInfo() {
      clearActionOtherBonusSelectInfo();
      bitField0_ |= 0x00000002;
      return bonusSelectInfo;
    }

    /**
     * <code>optional .RogueBonusSelectInfo bonus_select_info = 1035;</code>
     * @param value the bonusSelectInfo to set
     * @return this
     */
    public RogueAction setBonusSelectInfo(
        final RogueBonusSelectInfoOuterClass.RogueBonusSelectInfo value) {
      clearActionOtherBonusSelectInfo();
      bitField0_ |= 0x00000002;
      bonusSelectInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 1903;</code>
     * @return whether the buffSelectInfo field is set
     */
    public boolean hasBuffSelectInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 1903;</code>
     * @return this
     */
    public RogueAction clearBuffSelectInfo() {
      bitField0_ &= ~0x00000004;
      buffSelectInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 1903;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffSelectInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo getBuffSelectInfo() {
      return buffSelectInfo;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 1903;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo getMutableBuffSelectInfo(
        ) {
      clearActionOtherBuffSelectInfo();
      bitField0_ |= 0x00000004;
      return buffSelectInfo;
    }

    /**
     * <code>optional .RogueCommonBuffSelectInfo buff_select_info = 1903;</code>
     * @param value the buffSelectInfo to set
     * @return this
     */
    public RogueAction setBuffSelectInfo(
        final RogueCommonBuffSelectInfoOuterClass.RogueCommonBuffSelectInfo value) {
      clearActionOtherBuffSelectInfo();
      bitField0_ |= 0x00000004;
      buffSelectInfo.copyFrom(value);
      return this;
    }

    @Override
    public RogueAction copyFrom(final RogueAction other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        miracleSelectInfo.copyFrom(other.miracleSelectInfo);
        bonusSelectInfo.copyFrom(other.bonusSelectInfo);
        buffSelectInfo.copyFrom(other.buffSelectInfo);
      }
      return this;
    }

    @Override
    public RogueAction mergeFrom(final RogueAction other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMiracleSelectInfo()) {
        getMutableMiracleSelectInfo().mergeFrom(other.miracleSelectInfo);
      }
      if (other.hasBonusSelectInfo()) {
        getMutableBonusSelectInfo().mergeFrom(other.bonusSelectInfo);
      }
      if (other.hasBuffSelectInfo()) {
        getMutableBuffSelectInfo().mergeFrom(other.buffSelectInfo);
      }
      return this;
    }

    @Override
    public RogueAction clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      miracleSelectInfo.clear();
      bonusSelectInfo.clear();
      buffSelectInfo.clear();
      return this;
    }

    @Override
    public RogueAction clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      miracleSelectInfo.clearQuick();
      bonusSelectInfo.clearQuick();
      buffSelectInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueAction)) {
        return false;
      }
      RogueAction other = (RogueAction) o;
      return bitField0_ == other.bitField0_
        && (!hasMiracleSelectInfo() || miracleSelectInfo.equals(other.miracleSelectInfo))
        && (!hasBonusSelectInfo() || bonusSelectInfo.equals(other.bonusSelectInfo))
        && (!hasBuffSelectInfo() || buffSelectInfo.equals(other.buffSelectInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawLittleEndian16((short) 5522);
        output.writeMessageNoTag(miracleSelectInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawLittleEndian16((short) 16602);
        output.writeMessageNoTag(bonusSelectInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawLittleEndian16((short) 30458);
        output.writeMessageNoTag(buffSelectInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(miracleSelectInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(bonusSelectInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(buffSelectInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueAction mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 2706: {
            // miracleSelectInfo
            clearActionOtherMiracleSelectInfo();
            input.readMessage(miracleSelectInfo);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 8282) {
              break;
            }
          }
          case 8282: {
            // bonusSelectInfo
            clearActionOtherBonusSelectInfo();
            input.readMessage(bonusSelectInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 15226) {
              break;
            }
          }
          case 15226: {
            // buffSelectInfo
            clearActionOtherBuffSelectInfo();
            input.readMessage(buffSelectInfo);
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
        output.writeMessage(FieldNames.miracleSelectInfo, miracleSelectInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.bonusSelectInfo, bonusSelectInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.buffSelectInfo, buffSelectInfo);
      }
      output.endObject();
    }

    @Override
    public RogueAction mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1009314021:
          case -1608054973: {
            if (input.isAtField(FieldNames.miracleSelectInfo)) {
              if (!input.trySkipNullValue()) {
                clearActionOtherMiracleSelectInfo();
                input.readMessage(miracleSelectInfo);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1283182921:
          case -1836716559: {
            if (input.isAtField(FieldNames.bonusSelectInfo)) {
              if (!input.trySkipNullValue()) {
                clearActionOtherBonusSelectInfo();
                input.readMessage(bonusSelectInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -255242115:
          case 1500540965: {
            if (input.isAtField(FieldNames.buffSelectInfo)) {
              if (!input.trySkipNullValue()) {
                clearActionOtherBuffSelectInfo();
                input.readMessage(buffSelectInfo);
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
    public RogueAction clone() {
      return new RogueAction().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueAction parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueAction(), data).checkInitialized();
    }

    public static RogueAction parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueAction(), input).checkInitialized();
    }

    public static RogueAction parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueAction(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueAction messages
     */
    public static MessageFactory<RogueAction> getFactory() {
      return RogueActionFactory.INSTANCE;
    }

    private enum RogueActionFactory implements MessageFactory<RogueAction> {
      INSTANCE;

      @Override
      public RogueAction create() {
        return RogueAction.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName miracleSelectInfo = FieldName.forField("miracleSelectInfo", "miracle_select_info");

      static final FieldName bonusSelectInfo = FieldName.forField("bonusSelectInfo", "bonus_select_info");

      static final FieldName buffSelectInfo = FieldName.forField("buffSelectInfo", "buff_select_info");
    }
  }
}
