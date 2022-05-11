package chapter01;

import bean.Person;

import java.io.*;

public class Singleton implements Serializable {

    public static final Singleton instance = new Singleton();
    private Singleton(){}

    public static void main(String[] args) {
        try {
            testSerializable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void testSerializable() throws Exception {
        File file = new File("singleton.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(Singleton.instance);
        System.out.println("hepan 序列化对象 "+Singleton.instance);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object result  = ois.readObject();
        ois.close();
        System.out.println("hepan 反序列化对象 "+result); // readResolve 方法保证反序列化对象为 Singleton.instance
    }

    // 此方法，在反序列化时调用，可以由用户决定反序列化结果。单例类需要处理
    private Object readResolve(){
        return instance;
    }
}


