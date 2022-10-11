package space.xiami.project.genshincommon.enums;

public enum ReliquaryTypeEnum {

    FLOWER_OF_LIFE((byte) 0, "Flower of Life"),
    PLUME_OF_DEATH((byte) 1, "Plume of Death"),
    SANDS_OF_EON((byte) 2, "Sands of Eon"),
    GOBLET_OF_EONOTHEM((byte) 3, "Goblet of Eonothem"),
    CIRCLET_OF_LOGOS((byte) 4, "Circlet of Logos"),;

    private final byte code;
    private final String desc;

    ReliquaryTypeEnum(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
