package annotation;

import java.lang.reflect.Method;

public class ServiceRun {
    public static void main(String[] args) throws Exception {
        Method[] declaredMethod = Service.class.getDeclaredMethods();

        Service service = new Service();

        for (Method method : declaredMethod) {
            if (method.isAnnotationPresent(PrintAnnotation.class)) {
                System.out.println("[[[[[[[" + method.getName() + "]]]]]]]");

                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                for (int i = 0; i < printAnnotation.number(); i++) {
                    System.out.print(printAnnotation.value());
                }
                System.out.println();
            }

            method.invoke(service);
        }
    }
}
