package practice2;

public abstract class Engineer {

    public abstract void design();

    public abstract void implement();

    public abstract void test();

    public abstract String getName();


    // Template method
    public void work() {
        System.out.println(this.getName() + "：仕事を開始します");
        this.design();
        this.implement();
        this.test();
        System.out.println(this.getName() + "：仕事が完了しました\n");
    }
}