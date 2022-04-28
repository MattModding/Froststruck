package net.mattwamm.froststruck.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Biome.class)
public interface BiomeTemperatureInvoker {

    @Invoker("computeTemperature")
    public float computeTemperatureInvoker(BlockPos pos);

}
