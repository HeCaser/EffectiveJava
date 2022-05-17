package chapter01;


import java.io.*;

public class SingletonTest implements Serializable {

    public static void main(String[] args) {
        try {
//            testSerializable();
            testEnumSerializable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testSerializable() throws Exception {
        File file = new File("singleton.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(Singleton.instance);
        System.out.println("hepan 序列化对象 "+ Singleton.instance);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object result  = ois.readObject();
        ois.close();
        System.out.println("hepan 反序列化对象 "+result); // 枚举类保证反序列化后对象不变
    }

    private static void testEnumSerializable() throws Exception{
        File file = new File("singleton.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(SingletonEnum.INSTANCE);
        System.out.println("hepan 序列化对象 "+ SingletonEnum.INSTANCE);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object result  = ois.readObject();
        ois.close();
        System.out.println("hepan 反序列化对象 "+result);
    }
    private static void testSingleton(){}
}


