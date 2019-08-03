## spring boot 与 spring cloud 版本是否是兼容？

### 主要字段的含义

| field      |    含义 | 备注  |
| -------- | --------  | -- |
|  PID   | 进程id |     |
| USER	|   进程所有者的用户名 |   |
| PR  |   优先级 |   |
| NI  |  nice值，负值表示高优先级，正值表示低优先级 |   |
| %CPU  |  上次更新到现在的CPU时间占用百分比 |   |
| TIME+ |  进程使用的CPU时间总计，单位1/100秒 |   |
| %MEM |  进程使用的物理内存百分比 |   |
| VIRT  |  进程使用的虚拟内存总量，单位Kb，VIRT=SWAP+RES |   |
| RES|  进程使用的、未被换出的物理内存大小，单位kb，RES=CODE+DATA |   |
| SHR|  共享内存大小，单位kb |   |
| COMMAND  |  命令名/命令行 |   |