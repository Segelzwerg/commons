package io.github.ititus.si.quantity.type;

import io.github.ititus.data.Lazy;
import io.github.ititus.si.dimension.Dimension;
import io.github.ititus.si.unit.Unit;

import java.util.function.Supplier;

abstract class AbstractQuantityType<Q extends QuantityType<Q>> implements QuantityType<Q> {

    private final Dimension dimension;
    private final Lazy<Unit<Q>> standardUnit;

    AbstractQuantityType(Dimension dimension, Supplier<Unit<Q>> standardUnit) {
        this.dimension = dimension;
        this.standardUnit = Lazy.of(standardUnit);
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public Unit<Q> getStandardUnit() {
        return standardUnit.get();
    }
}
