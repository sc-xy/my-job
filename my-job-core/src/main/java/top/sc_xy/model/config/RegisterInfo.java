package top.sc_xy.model.config;

import java.io.Serializable;
import java.util.List;

/**
 * @author sc-xy
 * @time 2024/7/22
 */
public class RegisterInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String ipAddress;

    private int port;

    private String groupName;

    private List<String> interfaces;


}
