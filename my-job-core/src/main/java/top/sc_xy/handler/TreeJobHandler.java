package top.sc_xy.handler;

import top.sc_xy.model.TreeTask;

/**
 * @author sc-xy
 * @time 2024/7/16
 */
public interface TreeJobHandler {
    TreeTask execute(TreeTask task);
}
