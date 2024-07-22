package top.sc_xy.handler;

import top.sc_xy.model.task.Task;
import top.sc_xy.model.task.TaskResult;

/**
 * @author sc-xy
 * @time 2024/7/16
 */
public interface SimpleJobHandler {
    TaskResult execute(Task task);
}
