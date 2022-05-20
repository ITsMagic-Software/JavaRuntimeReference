package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */

public class MPRoom {
    private String id;
    private String display_id;
    private String status;
    private String slots;
    private String bandwidth;
    private String syncrate;

    private String on_ip;
    private int on_port;
    private String used_slots;
    private String used_bandwidth;

    public MPRoom(String id, String display_id, String status, String slots, String bandwidth, String used_bandwidth, String syncrate, String on_ip, int on_port, String used_slots) {
        this.id = id;
        this.display_id = display_id;
        this.status = status;
        this.slots = slots;
        this.bandwidth = bandwidth;
        this.syncrate = syncrate;
        this.on_ip = on_ip;
        this.on_port = on_port;
        this.used_slots = used_slots;
        this.used_bandwidth = used_bandwidth;
    }


    @HideGetSet
    public String getId() {
        return id;
    }
    @HideGetSet
    public void setId(String id) {
        this.id = id;
    }

    @HideGetSet
    public String getDisplay_id() {
        return display_id;
    }
    @HideGetSet
    public void setDisplay_id(String display_id) {
        this.display_id = display_id;
    }

    @HideGetSet
    public String getStatus() {
        return status;
    }
    @HideGetSet
    public void setStatus(String status) {
        this.status = status;
    }

    @HideGetSet
    public String getSlots() {
        return slots;
    }
    @HideGetSet
    public void setSlots(String slots) {
        this.slots = slots;
    }

    @HideGetSet
    public String getBandwidth() {
        return bandwidth;
    }
    @HideGetSet
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    @HideGetSet
    public String getSyncrate() {
        return syncrate;
    }
    @HideGetSet
    public void setSyncrate(String syncrate) {
        this.syncrate = syncrate;
    }

    @HideGetSet
    public String getIp() {
        return on_ip;
    }
    @HideGetSet
    public void setIp(String on_ip) {
        this.on_ip = on_ip;
    }


    @HideGetSet
    public int getPort() {
        return on_port;
    }
    @HideGetSet
    public void setPort(int on_port) {
        this.on_port = on_port;
    }

    @HideGetSet
    public String getUsedSlots() {
        return used_slots;
    }
    @HideGetSet
    public void setUsedSlots(String used_slots) {
        this.used_slots = used_slots;
    }

    @HideGetSet
    public String getUsedBandwidth() {
        return used_bandwidth;
    }
    @HideGetSet
    public void setUsedBandwidth(String used_bandwidth) {
        this.used_bandwidth = used_bandwidth;
    }
}