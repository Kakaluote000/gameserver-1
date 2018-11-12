package lucas.core.packet.packethandler;

import lucas.core.packet.Req_Login;


/**
 * @author lushengkao vip8
 * 消息类型
 * 2018/11/7 16:22
 */
public enum  PacketType {

    //登陆
    LOGIN(1, Req_Login.class,true);

    PacketType(int command, Class<? extends AbstractPacket> clazz, boolean req) {
        this.command = command;
        this.clazz = clazz;
        this.req = req;
    }

    private int command;

    private Class<? extends AbstractPacket> clazz;

    private boolean req;

    public boolean isReq() {
        return req;
    }

    public void setReq(boolean req) {
        this.req = req;
    }

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public Class<? extends AbstractPacket> getClazz() {
        return clazz;
    }

    public void setClazz(Class<? extends AbstractPacket> clazz) {
        this.clazz = clazz;
    }

}