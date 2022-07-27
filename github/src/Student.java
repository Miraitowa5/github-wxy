//学生类
public class Student {
    /**
     * 属性或者特征去描述该类
     * 学号
     * 姓名
     * 年龄
     * 性别
     * 就读学校
     * 成绩
     */

    public String studentNo;
    public String studentName;
    public int studentAge;
    public String studentMale;
    public String studentSchool;
    public int getStudentScore;
    /**
     * 行为
     * 上晚自习
     * 泡图书馆
     * 上课
     * 做广播体操
     */

    public void goToNightClasses(){
        System.out.println("我们在认真上晚自习");
    }
    public void goToLibrary(){
        System.out.println("我们在泡图书馆");
    }
    public void attendClass(){
        System.out.println("我们在上课");
    }
    public void doRadioGymnastics(){
        System.out.println("我们在做广播体操");
    }

}
