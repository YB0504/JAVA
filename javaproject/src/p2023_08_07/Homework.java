package p2023_08_07;


//File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나
//디렉토리 체제를 관리하는 클래스임.
import java.io.File;

public class Homework {

	public static void main(String[] args) {
		try {
			// File 객체 생성
			// c:/java01/temp 폴더가 생성되고, 현 위치 하위에
			// test폴더가 생성됨
			File temp = new File("C:/java01", "temp");
			File tempFile = new File("test");

			// 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를
			// 반환함)
			System.out.println("create directory state : " + temp.mkdirs());
			System.out.println("create directory state : " + tempFile.mkdirs());

//			1. 디렉토리 삭제 (비어있는 디렉토리만 삭제된다)
//			tempFile.delete();

//			2. 비어있지 않은 디렉토리 삭제
			// 배열형태로 모든 파일을 돌려받는 메소드사용
			// 반복문사용
			
			// File안에 파일 및 폴더를 모두 불러오는 배열 객체 생성
			File[] tempFile1 = tempFile.listFiles();
			for (int i = 0; i < tempFile1.length; i++) {
				// 배열의 길이만큼 루프돌면서 폴더안의 파일 삭제
				tempFile1[i].delete();
			}// for문 end
			// 최종적으로 파일이 모두 삭제된 빈폴더 "test" 폴더 삭제
			tempFile.delete();
			
//			3. 자식 디렉토리 삭제
//			temp.delete();

//			4. 부모 디렉토리 삭제
//			temp.getParentFile().delete();

			// File 클래스에서 제공하는 메소드로 파일 시스템에 대한
			// 여러가지 정보를 얻을수 있음

			// 읽기 권한
			System.out.println("temp canRead : " + temp.canRead());
			// 쓰기 권한
			System.out.println("temp canWrite : " + temp.canWrite());
			// 절대 경로를 구하라는 의미
			System.out.println("temp getAbsoluteFile : " + temp.getAbsoluteFile());
			// 가장 바깥쪽의 폴더명
			System.out.println("temp getName : " + temp.getName());
			// 부모 폴더명
			System.out.println("temp getParent : " + temp.getParent());
			// 절대 경로
			System.out.println("temp getPath : " + temp.getPath());
			// 디렉토리의 유무
			System.out.println("temp isDirectory : " + temp.isDirectory());
			// 파일의 유무
			System.out.println("temp isFile : " + temp.isFile());
		} catch (Exception e) {
		}
	}
}
