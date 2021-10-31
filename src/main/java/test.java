/**
 * Project name(项目名称)：包装类_装箱和拆箱
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 13:15
 * Version(版本): 1.0
 * Description(描述)：
 * 基本数据类型及对应的包装类
 * 序号	基本数据类型	包装类
 * 1	byte	Byte
 * 2	short	Short
 * 3	int	Integer
 * 4	long	Long
 * 5	char	Character
 * 6	float	Float
 * 7	double	Double
 * 8	boolean	Boolean
 */

public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        int data = 23458;
        Integer data1 = data;       // 自动装箱
        int data2 = data1;          // 自动拆箱
        System.out.println(data2);
        Integer data3 = 500;

        System.out.println(data3.equals(data1));
        // 实现 int 和 Integer 的相互转换
        int data4 = 290248;
        @SuppressWarnings("all")
        Integer data5 = new Integer(data4);    // 手动装箱 已弃用
        @SuppressWarnings("all")
        int data6 = data5.intValue();          // 手动拆箱
        System.out.println(data6);

        //将字符串转换为数值类型
        String str1 = "89247";
        String str2 = "658.258";
        int data7 = Integer.parseInt(str1);
        float data8 = Float.parseFloat(str2);
        double data9 = Double.parseDouble(str2);
        System.out.println(data7);
        System.out.println(data8);
        System.out.println(data9);

        //将整数转换为字符串
        String str3 = Integer.toString(data7);
        String str4 = Float.toString(data8);
        String str5 = Double.toString(data9);
        String str6 = data7 + "";            //时间复杂度较高
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
