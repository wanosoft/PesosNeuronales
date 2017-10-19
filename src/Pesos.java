
public class Pesos {

	public float sumatoria(float w1, float w2, float w3, float x1, float x2, float x3){
		return ((w1*x1)+(w2*x2)+(w3*x3));
	}
	
	public float error(float w, float E, float n , float x) {
		return w +(E*n*x);
	}
}
