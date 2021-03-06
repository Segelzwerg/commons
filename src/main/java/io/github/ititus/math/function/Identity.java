package io.github.ititus.math.function;

import io.github.ititus.math.function.constant.Constant;
import io.github.ititus.math.number.BigComplex;

public final class Identity extends ComplexFunction {

    private static final Identity IDENTITY = new Identity();

    private Identity() {
    }

    public static ComplexFunction get() {
        return IDENTITY;
    }

    @Override
    public BigComplex evaluate(BigComplex z) {
        return z;
    }

    @Override
    protected ComplexFunction derivative0(int n) {
        return n == 1 ? Constant.one() : Constant.zero();
    }

    @Override
    public boolean isIdentity() {
        return true;
    }

    @Override
    protected String toString(boolean inner) {
        return VAR;
    }

    @Override
    protected boolean equals0(ComplexFunction f) {
        return f.getClass() == Identity.class;
    }

    @Override
    public int hashCode() {
        return Identity.class.hashCode();
    }
}
