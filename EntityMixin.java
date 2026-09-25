package com.egor.solohitboxes.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @Inject(method = "getTargetingMargin", at = @At("RETURN"), cancellable = true)
    private void soloHitboxes$expandTargetingMargin(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(cir.getReturnValue() + 0.35F);
    }
}
