package UsePackageHelloWorld;

import hello.PackageHelloWorld;
//	import hello.*;
//	hello 패키지 안의 모든 클래스를 import한다는 의미

public class UsePackageHelloWorld {

    public static void main( String[] args ) {
	PackageHelloWorld phw = new PackageHelloWorld();
	phw.printHello();
    }
}
