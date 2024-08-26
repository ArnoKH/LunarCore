// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class MissionStatusOuterClass {
  /**
   * Protobuf enum {@code MissionStatus}
   */
  public enum MissionStatus implements ProtoEnum<MissionStatus> {
    /**
     * <code>MISSION_NONE = 0;</code>
     */
    MISSION_NONE("MISSION_NONE", 0),

    /**
     * <code>MISSION_DOING = 1;</code>
     */
    MISSION_DOING("MISSION_DOING", 1),

    /**
     * <code>MISSION_FINISH = 2;</code>
     */
    MISSION_FINISH("MISSION_FINISH", 2),

    /**
     * <code>MISSION_PREPARED = 3;</code>
     */
    MISSION_PREPARED("MISSION_PREPARED", 3);

    /**
     * <code>MISSION_NONE = 0;</code>
     */
    public static final int MISSION_NONE_VALUE = 0;

    /**
     * <code>MISSION_DOING = 1;</code>
     */
    public static final int MISSION_DOING_VALUE = 1;

    /**
     * <code>MISSION_FINISH = 2;</code>
     */
    public static final int MISSION_FINISH_VALUE = 2;

    /**
     * <code>MISSION_PREPARED = 3;</code>
     */
    public static final int MISSION_PREPARED_VALUE = 3;

    private final String name;

    private final int number;

    private MissionStatus(String name, int number) {
      this.name = name;
      this.number = number;
    }

    /**
     * @return the string representation of enum entry
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * @return the numeric wire value of this enum entry
     */
    @Override
    public int getNumber() {
      return number;
    }

    /**
     * @return a converter that maps between this enum's numeric and text representations
     */
    public static EnumConverter<MissionStatus> converter() {
      return MissionStatusConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static MissionStatus forNumber(int value) {
      return MissionStatusConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static MissionStatus forNumberOr(int number, MissionStatus other) {
      MissionStatus value = forNumber(number);
      return value == null ? other : value;
    }

    enum MissionStatusConverter implements EnumConverter<MissionStatus> {
      INSTANCE;

      private static final MissionStatus[] lookup = new MissionStatus[4];

      static {
        lookup[0] = MISSION_NONE;
        lookup[1] = MISSION_DOING;
        lookup[2] = MISSION_FINISH;
        lookup[3] = MISSION_PREPARED;
      }

      @Override
      public final MissionStatus forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final MissionStatus forName(final CharSequence value) {
        switch (value.length()) {
          case 12: {
            if (ProtoUtil.isEqual("MISSION_NONE", value)) {
              return MISSION_NONE;
            }
            break;
          }
          case 13: {
            if (ProtoUtil.isEqual("MISSION_DOING", value)) {
              return MISSION_DOING;
            }
            break;
          }
          case 14: {
            if (ProtoUtil.isEqual("MISSION_FINISH", value)) {
              return MISSION_FINISH;
            }
            break;
          }
          case 16: {
            if (ProtoUtil.isEqual("MISSION_PREPARED", value)) {
              return MISSION_PREPARED;
            }
            break;
          }
        }
        return null;
      }
    }
  }
}
