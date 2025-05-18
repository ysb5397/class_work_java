package generic.ch03;

/**
 *
 * Material을 상속받은 클래스만 대체 문자열에 가능
 */

public class GenericPrinter<T extends Material> {
    T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
