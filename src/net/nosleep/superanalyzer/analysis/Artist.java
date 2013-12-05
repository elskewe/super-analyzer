/****************************************************************************
 The Super Analyzer
 Copyright (C) 2009 Tom Bulatewicz, Nosleep Software

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 ***************************************************************************/

package net.nosleep.superanalyzer.analysis;

/**
 * This class is a holder for artist information. It includes a Stat object that
 * has statistics about an artist. It does _not_ store the name of the artist,
 * since artists are hashed by their name, so we do not want to store it twice.
 */
class Artist implements StatHolder
{

	private Stat stats;

	/**
	 * A simple constructor to set our data members.
	 */
	public Artist()
	{
		this.stats = new Stat();
	}

	/**
	 * Tells the Stat object to analyze a track.
	 */
	public void analyze(Track track)
	{
		stats.analyze(track);
	}

	public Stat getStats()
	{
		return stats;
	}

}
