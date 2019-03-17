package edu.stu.domain;

public class DataObject {

    public static final int COL = 122;

    private int cid; // 元素所在的聚类的标号

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    private double duration;

    private int protocolType[] = new int[3];

    private int service[] = new int[70];

    private int flag[] = new int[11];

    private double srcBytes;

    private double dstBytes;

    private int land;

    private double wrongFragment;

    private double urgent;

    private double hot;

    private double numFailedLogins;

    private int loggedIn;

    private double numCompromised;

    private double rootShell;

    private double suAttempted;

    private double numRoot;

    private double numFileCreations;

    private double numShells;

    private double numAccessFiles;

    private double numOutboundCmds;

    private int isHostLogin;

    private int isGuestLogin;

    private double count;

    private double srvCount;

    private double serrorRate;

    private double srvSerrorRate;

    private double rerrorRate;

    private double srvRerrorRate;

    private double sameSrvRate;

    private double diffSrvRate;

    private double srvDiffHostRate;

    private double dstHostCount;

    private double dstHostSrvCount;

    private double dstHostSameSrvRate;

    private double dstHostDiffSrvRate;

    private double dstHostSameSrcPortRate;

    private double dstHostSrvDiffHostRate;

    private double dstHostSerrorRate;

    private double dstHostSrvSerrorRate;

    private double dstHostRerrorRate;

    private double dstHostSrvRerrorRate;

    private boolean clazz; // 类标

    private double[] vector;

    public DataObject(String data) {
        String[] strings = data.split(",");
        vector = new double[COL];

        setDuration(strings[0], 0);
        setProtocolType(strings[1], 1);
        setService(strings[2], 4);
        setFlag(strings[3], 74);
        setSrcBytes(strings[4], 85);
        setDstBytes(strings[5], 86);
        setLand(strings[6], 87);
        setWrongFragment(strings[7], 88);
        setUrgent(strings[8], 89);
        setHot(strings[9], 90);
        setNumFailedLogins(strings[10], 91);
        setLoggedIn(strings[11], 92);
        setNumCompromised(strings[12], 93);
        setRootShell(strings[13], 94);
        setSuAttempted(strings[14], 95);
        setNumRoot(strings[15], 96);
        setNumFileCreations(strings[16], 97);
        setNumShells(strings[17], 98);
        setNumAccessFiles(strings[18], 99);
        setNumOutboundCmds(strings[19], 100);
        setIsHostLogin(strings[20], 101);
        setIsGuestLogin(strings[21], 102);
        setCount(strings[22], 103);
        setSrvCount(strings[23], 104);
        setSerrorRate(strings[24], 105);
        setSrvSerrorRate(strings[25], 106);
        setRerrorRate(strings[26], 107);
        setSrvRerrorRate(strings[27], 108);
        setSameSrvRate(strings[28], 109);
        setDiffSrvRate(strings[29], 110);
        setSrvDiffHostRate(strings[30], 111);
        setDstHostCount(strings[31], 112);
        setDstHostSrvCount(strings[32], 113);
        setDstHostSameSrvRate(strings[33], 114);
        setDstHostDiffSrvRate(strings[34], 115);
        setDstHostSameSrcPortRate(strings[35], 116);
        setDstHostSrvDiffHostRate(strings[36], 117);
        setDstHostSerrorRate(strings[37], 118);
        setDstHostSrvSerrorRate(strings[38], 119);
        setDstHostRerrorRate(strings[39], 120);
        setDstHostSrvRerrorRate(strings[40], 121);
        setClazz(strings[41]);
    }

    public void setDuration(String duration1, int idx) {
        this.duration = Double.parseDouble(duration1);
        vector[idx] = duration;
    }

    public void setProtocolType(String protocolType1, int idx) {
        switch (protocolType1) {
            case "tcp":
                this.protocolType[0] = 1;
                break;
            case "udp":
                this.protocolType[1] = 1;
                break;
            case "icmp":
                this.protocolType[2] = 1;
                break;
        }

        for (int i = idx, j = 0;
             i < idx + 3;
             i++, j++) {
            vector[i] = protocolType[j];
        }
    }

    public void setService(String service1, int idx) {
        switch (service1) {
            case "aol":
                service[0] = 1;
                break;
            case "auth":
                service[1] = 1;
                break;
            case "bgp":
                service[2] = 1;
                break;
            case "courier":
                service[3] = 1;
                break;
            case "csnet_ns":
                service[4] = 1;
                break;
            case "ctf":
                service[5] = 1;
                break;
            case "daytime":
                service[6] = 1;
                break;
            case "discard":
                service[7] = 1;
                break;
            case "domain":
                service[8] = 1;
                break;
            case "domain_u":
                service[9] = 1;
                break;
            case "echo":
                service[10] = 1;
                break;
            case "eco_i":
                service[11] = 1;
                break;
            case "ecr_i":
                service[12] = 1;
                break;
            case "efs":
                service[13] = 1;
                break;
            case "exec":
                service[14] = 1;
                break;
            case "finger":
                service[15] = 1;
                break;
            case "ftp":
                service[16] = 1;
                break;
            case "ftp_data":
                service[17] = 1;
                break;
            case "gopher":
                service[18] = 1;
                break;
            case "harvest":
                service[19] = 1;
                break;
            case "hostnames":
                service[20] = 1;
                break;
            case "http":
                service[21] = 1;
                break;
            case "http_2784":
                service[22] = 1;
                break;
            case "http_443":
                service[23] = 1;
                break;
            case "http_8001":
                service[24] = 1;
                break;
            case "imap4":
                service[25] = 1;
                break;
            case "IRC":
                service[26] = 1;
                break;
            case "iso_tsap":
                service[27] = 1;
                break;
            case "klogin":
                service[28] = 1;
                break;
            case "kshell":
                service[29] = 1;
                break;
            case "ldap":
                service[30] = 1;
                break;
            case "link":
                service[31] = 1;
                break;
            case "login":
                service[32] = 1;
                break;
            case "mtp":
                service[33] = 1;
                break;
            case "name":
                service[34] = 1;
                break;
            case "netbios_dgm":
                service[35] = 1;
                break;
            case "netbios_ns":
                service[36] = 1;
                break;
            case "netbios_ssn":
                service[37] = 1;
                break;
            case "netstat":
                service[38] = 1;
                break;
            case "nnsp":
                service[39] = 1;
                break;
            case "nntp":
                service[40] = 1;
                break;
            case "ntp_u":
                service[41] = 1;
                break;
            case "other":
                service[42] = 1;
                break;
            case "pm_dump":
                service[43] = 1;
                break;
            case "pop_2":
                service[44] = 1;
                break;
            case "pop_3":
                service[45] = 1;
                break;
            case "printer":
                service[46] = 1;
                break;
            case "private":
                service[47] = 1;
                break;
            case "red_i":
                service[48] = 1;
                break;
            case "remote_job":
                service[49] = 1;
                break;
            case "rje":
                service[50] = 1;
                break;
            case "shell":
                service[51] = 1;
                break;
            case "smtp":
                service[52] = 1;
                break;
            case "sql_net":
                service[53] = 1;
                break;
            case "ssh":
                service[54] = 1;
                break;
            case "sunrpc":
                service[55] = 1;
                break;
            case "supdup":
                service[56] = 1;
                break;
            case "systat":
                service[57] = 1;
                break;
            case "telnet":
                service[58] = 1;
                break;
            case "tftp_u":
                service[59] = 1;
                break;
            case "tim_i":
                service[60] = 1;
                break;
            case "time":
                service[61] = 1;
                break;
            case "urh_i":
                service[62] = 1;
                break;
            case "urp_i":
                service[63] = 1;
                break;
            case "uucp":
                service[64] = 1;
                break;
            case "uucp_path":
                service[65] = 1;
                break;
            case "vmnet":
                service[66] = 1;
                break;
            case "whois":
                service[67] = 1;
                break;
            case "X11":
                service[68] = 1;
                break;
            case "Z39_50":
                service[69] = 1;
                break;
        }

        for (int i = idx, j = 0;
             i < idx + 70;
             i++, j++) {
            vector[i] = service[j];
        }
    }

    public void setFlag(String flag1, int idx) {
        switch (flag1) {
            case "OTH":
                flag[0] = 1;
                break;
            case "REJ":
                flag[1] = 1;
                break;
            case "RSTO":
                flag[2] = 1;
                break;
            case "RSTOS0":
                flag[3] = 1;
                break;
            case "RSTR":
                flag[4] = 1;
                break;
            case "S0":
                flag[5] = 1;
                break;
            case "S1":
                flag[6] = 1;
                break;
            case "S2":
                flag[7] = 1;
                break;
            case "S3":
                flag[8] = 1;
                break;
            case "SF":
                flag[9] = 1;
                break;
            case "SH":
                flag[10] = 1;
                break;
        }

        for (int i = idx, j = 0;
             i < idx + 11;
             i++, j++) {
            vector[i] = flag[j];
        }
    }

    public void setSrcBytes(String srcBytes1, int idx) {
        this.srcBytes = Double.parseDouble(srcBytes1);
        vector[idx] = srcBytes;
    }

    public void setDstBytes(String dstBytes1, int idx) {
        this.dstBytes = Double.parseDouble(dstBytes1);
        vector[idx] = dstBytes;
    }

    public void setLand(String land1, int idx) {
        this.land = Integer.parseInt(land1);
        vector[idx] = land;
    }

    public void setWrongFragment(String wrongFragment1, int idx) {
        this.wrongFragment = Double.parseDouble(wrongFragment1);
        vector[idx] = wrongFragment;
    }

    public void setUrgent(String urgent1, int idx) {
        this.urgent = Double.parseDouble(urgent1);
        vector[idx] = urgent;
    }

    public void setHot(String hot1, int idx) {
        this.hot = Double.parseDouble(hot1);
        vector[idx] = hot;
    }

    public void setNumFailedLogins(String numFailedLogins1, int idx) {
        this.numFailedLogins = Double.parseDouble(numFailedLogins1);
        vector[idx] = numFailedLogins;
    }

    public void setLoggedIn(String loggedIn1, int idx) {
        this.loggedIn = Integer.parseInt(loggedIn1);
        vector[idx] = loggedIn;
    }

    public void setNumCompromised(String numCompromised1, int idx) {
        this.numCompromised = Double.parseDouble(numCompromised1);
        vector[idx] = numCompromised;
    }

    public void setRootShell(String rootShell1, int idx) {
        this.rootShell = Double.parseDouble(rootShell1);
        vector[idx] = rootShell;
    }

    public void setSuAttempted(String suAttempted1, int idx) {
        this.suAttempted = Double.parseDouble(suAttempted1);
        vector[idx] = suAttempted;
    }

    public void setNumRoot(String numRoot1, int idx) {
        this.numRoot = Double.parseDouble(numRoot1);
        vector[idx] = numRoot;
    }

    public void setNumFileCreations(String numFileCreations1, int idx) {
        this.numFileCreations = Double.parseDouble(numFileCreations1);
        vector[idx] = numFileCreations;
    }

    public void setNumShells(String numShells1, int idx) {
        this.numShells = Double.parseDouble(numShells1);
        vector[idx] = numShells;
    }

    public void setNumAccessFiles(String numAccessFiles1, int idx) {
        this.numAccessFiles = Double.parseDouble(numAccessFiles1);
        vector[idx] = numAccessFiles;
    }

    public void setNumOutboundCmds(String numOutboundCmds1, int idx) {
        this.numOutboundCmds = Double.parseDouble(numOutboundCmds1);
        vector[idx] = numOutboundCmds;
    }

    public void setIsHostLogin(String isHostLogin1, int idx) {
        this.isHostLogin = Integer.parseInt(isHostLogin1);
        vector[idx] = isHostLogin;
    }

    public void setIsGuestLogin(String isGuestLogin1, int idx) {
        this.isGuestLogin = Integer.parseInt(isGuestLogin1);
        vector[idx] = isGuestLogin;
    }

    public void setCount(String count1, int idx) {
        this.count = Double.parseDouble(count1);
        vector[idx] = count;
    }

    public void setSrvCount(String srvCount1, int idx) {
        this.srvCount = Double.parseDouble(srvCount1);
        vector[idx] = srvCount;
    }

    public void setSerrorRate(String serrorRate1, int idx) {
        this.serrorRate = Double.parseDouble(serrorRate1);
        vector[idx] = serrorRate;
    }

    public void setSrvSerrorRate(String srvSerrorRate1, int idx) {
        this.srvSerrorRate = Double.parseDouble(srvSerrorRate1);
        vector[idx] = srvSerrorRate;
    }

    public void setRerrorRate(String rerrorRate1, int idx) {
        this.rerrorRate = Double.parseDouble(rerrorRate1);
        vector[idx] = rerrorRate;
    }

    public void setSrvRerrorRate(String srvRerrorRate1, int idx) {
        this.srvRerrorRate = Double.parseDouble(srvRerrorRate1);
        vector[idx] = srvRerrorRate;
    }

    public void setSameSrvRate(String sameSrvRate1, int idx) {
        this.sameSrvRate = Double.parseDouble(sameSrvRate1);
        vector[idx] = sameSrvRate;
    }

    public void setDiffSrvRate(String diffSrvRate1, int idx) {
        this.diffSrvRate = Double.parseDouble(diffSrvRate1);
        vector[idx] = diffSrvRate;
    }

    public void setSrvDiffHostRate(String srvDiffHostRate1, int idx) {
        this.srvDiffHostRate = Double.parseDouble(srvDiffHostRate1);
        vector[idx] = srvDiffHostRate;
    }

    public void setDstHostCount(String dstHostCount1, int idx) {
        this.dstHostCount = Double.parseDouble(dstHostCount1);
        vector[idx] = dstHostCount;
    }

    public void setDstHostSrvCount(String dstHostSrvCount1, int idx) {
        this.dstHostSrvCount = Double.parseDouble(dstHostSrvCount1);
        vector[idx] = dstHostSrvCount;
    }

    public void setDstHostSameSrvRate(String dstHostSameSrvRate1, int idx) {
        this.dstHostSameSrvRate = Double.parseDouble(dstHostSameSrvRate1);
        vector[idx] = dstHostSameSrvRate;
    }

    public void setDstHostDiffSrvRate(String dstHostDiffSrvRate1, int idx) {
        this.dstHostDiffSrvRate = Double.parseDouble(dstHostDiffSrvRate1);
        vector[idx] = dstHostDiffSrvRate;
    }

    public void setDstHostSameSrcPortRate(String dstHostSameSrcPortRate1, int idx) {
        this.dstHostSameSrcPortRate = Double.parseDouble(dstHostSameSrcPortRate1);
        vector[idx] = dstHostSameSrcPortRate;
    }

    public void setDstHostSrvDiffHostRate(String dstHostSrvDiffHostRate1, int idx) {
        this.dstHostSrvDiffHostRate = Double.parseDouble(dstHostSrvDiffHostRate1);
        vector[idx] = dstHostSrvDiffHostRate;
    }

    public void setDstHostSerrorRate(String dstHostSerrorRate1, int idx) {
        this.dstHostSerrorRate = Double.parseDouble(dstHostSerrorRate1);
        vector[idx] = dstHostSerrorRate;
    }

    public void setDstHostSrvSerrorRate(String dstHostSrvSerrorRate1, int idx) {
        this.dstHostSrvSerrorRate = Double.parseDouble(dstHostSrvSerrorRate1);
        vector[idx] = dstHostSrvSerrorRate;
    }

    public void setDstHostRerrorRate(String dstHostRerrorRate1, int idx) {
        this.dstHostRerrorRate = Double.parseDouble(dstHostRerrorRate1);
        vector[idx] = dstHostRerrorRate;
    }

    public void setDstHostSrvRerrorRate(String dstHostSrvRerrorRate1, int idx) {
        this.dstHostSrvRerrorRate = Double.parseDouble(dstHostSrvRerrorRate1);
        vector[idx] = dstHostSrvRerrorRate;
    }

    public void setClazz(String clazz1) {
        if ("normal".equals(clazz1)) {
            this.clazz = true;
        } else if ("anomaly".equals(clazz1)) {
            this.clazz = false;
        }
    }

    public double[] getVector() {
        return vector;
    }

    public boolean isClazz() {
        return clazz;
    }
}
