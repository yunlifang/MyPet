/*
 * This file is part of MyPet-1.8
 *
 * Copyright (C) 2011-2014 Keyle
 * MyPet-1.8 is licensed under the GNU Lesser General Public License.
 *
 * MyPet-1.8 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MyPet-1.8 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.Keyle.MyPet.entity.types.endermite;

import de.Keyle.MyPet.entity.EntitySize;
import de.Keyle.MyPet.entity.types.EntityMyPet;
import de.Keyle.MyPet.entity.types.MyPet;
import net.minecraft.server.v1_8_R1.World;

@EntitySize(width = 0.4F, length = 0.3F, height = 0.1F)
public class EntityMyEndermite extends EntityMyPet {
    public EntityMyEndermite(World world, MyPet myPet) {
        super(world, myPet);
    }

    @Override
    protected String getDeathSound() {
        return "mob.silverfish.kill";
    }

    @Override
    protected String getHurtSound() {
        return "mob.silverfish.hit";
    }

    protected String getLivingSound() {
        return "mob.silverfish.say";
    }

    @Override
    public void playStepSound() {
        makeSound("mob.silverfish.step", 1.0F, 1.0F);
    }
}