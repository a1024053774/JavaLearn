package Chapter07.com.extend_;

public class ExtendsExercise03 {

    public static void main(String[] args) {


        PC pc = new PC("i9-1400k","128GB","10TB","戴尔");
        NotePad notePad = new NotePad("骁龙8Gen-1","16GB","512GB","深空灰");
        pc.printPCInfo();
        System.out.println();
        notePad.printNotePadInfo();


    }
}


class Computer {
    private String Cpu;
    private String Memory;
    private String HardDrive;

    public Computer(String cpu, String memory, String hardDrive) {
        Cpu = cpu;
        Memory = memory;
        HardDrive = hardDrive;
    }

    public String getCpu() {
        return Cpu;
    }

    public void setCpu(String cpu) {
        Cpu = cpu;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHardDrive() {
        return HardDrive;
    }

    public void setHardDrive(String hardDrive) {
        HardDrive = hardDrive;
    }

    public String getDetails(){
        return "cpu是" + this.Cpu + " 内存是" + this.Memory + " 硬盘是" + this.HardDrive;
    }
}

class PC extends Computer{
    private String Brand;

    public PC(String cpu, String memory, String hardDrive, String brand) {
        super(cpu, memory, hardDrive);
        this.Brand = brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getBrand() {
        return this.Brand;
    }

    public void printPCInfo(){
        System.out.println("pc信息如下");
        System.out.println(getDetails() + " 品牌是" + getBrand());
    }

}

class NotePad extends Computer{
    private String Color;

    public NotePad(String cpu, String memory, String hardDrive, String color) {
        super(cpu, memory, hardDrive);
        this.Color = color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getColor() {
        return this.Color;
    }
    public void printNotePadInfo(){
        System.out.println("NotePad信息如下");
        System.out.println(getDetails() + " 颜色是" + getColor());
    }
}



