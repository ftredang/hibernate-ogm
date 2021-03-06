/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ogm.util.configurationreader.spi;

/**
 * Implementations map short names into fully-qualified class names.
 *
 * @author Gunnar Morling
 */
public interface ShortNameResolver {

	/**
	 * Does not accept null values for the {@code name} parameter.
	 */
	boolean isShortName(String name);

	/**
	 * Does not accept null values for the {@code name} parameter.
	 */
	String resolve(String shortName);
}
