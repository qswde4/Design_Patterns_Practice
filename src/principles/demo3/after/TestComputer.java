package principles.demo3.after;

/**
 * 测试类
 */
public class TestComputer {
    public static void main(String[] args) {
        //创建计算机的组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        //创建计算机对象
        Computer computer = new Computer();
        //组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        //运行计算机
        computer.run();
    }
}
