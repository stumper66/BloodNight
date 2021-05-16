package de.eldoria.bloodnight.specialmob.node.predicate;

import de.eldoria.bloodnight.specialmob.ISpecialMob;
import de.eldoria.bloodnight.specialmob.node.context.IActionContext;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class HasTarget implements PredicateNode {
    @Override
    public boolean test(ISpecialMob mob, IActionContext context) {
        return mob.getBase().getTarget() != null;
    }

    @NotNull
    @Override
    public Map<String, Object> serialize() {
        return null;
    }
}
