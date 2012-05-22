/*
 * CitizensAPI
 * Copyright (C) 2012 CitizensDev <http://citizensnpcs.net>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package net.citizensnpcs.api.npc;

import net.citizensnpcs.api.compat.Position;

/**
 * Represents an NPC.
 */
public interface NPC {

    /**
     * Returns a new NPC that is identical to this NPC.
     * 
     * @return A new NPC instance with this NPC's data
     */
    public NPC copy();

    /**
     * Returns the {@link Position} of this NPC.
     * 
     * @return Position of this NPC
     */
    public Position getPosition();

    /**
     * Moves this NPC to the given {@link Position}.
     * 
     * @param position
     *            Positon to move this NPC to
     */
    public void moveTo(Position position);

    /**
     * Spawns this NPC at the given {@link Position}.
     * 
     * @param position
     *            Position to spawn this NPC at
     */
    public void spawn(Position position);
}
