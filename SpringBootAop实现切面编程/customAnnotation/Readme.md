切面编程的几个核心注解
1打开切面编程的代理@EnableAspectJProxy
2定义切面类@Aspect
3定义切点@PointCut
4@Before @After使用


@Component
@Aspect
public class DefinePointCut {

    @Pointcut("@annotation(com.tango.customAnnotation.TangoLog)")
    public void pointCut(){

    }


    @Before("pointCut()")
    public void before(JoinPoint point) throws Exception {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        Field hehe = method.getDeclaringClass().getDeclaredField("hehe");
        hehe.setAccessible(true);
        TangoLog log = method.getAnnotation(TangoLog.class);
        System.out.println(signature.getMethod().getName());
    }

    @After("pointCut()")
    public void afterPoint(){
        System.out.println("世界如此美好！");
    }

}
