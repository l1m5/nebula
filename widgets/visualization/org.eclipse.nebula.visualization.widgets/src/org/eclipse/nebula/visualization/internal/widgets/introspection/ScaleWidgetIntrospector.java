/*******************************************************************************
 * Copyright (c) 2010 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.eclipse.nebula.visualization.internal.widgets.introspection;

import org.eclipse.nebula.visualization.widgets.figures.AbstractScaledWidgetFigure;

/**The introspector for widget inherited from {@link AbstractScaledWidgetFigure}.
 * @author Xihui Chen
 *
 */
public class ScaleWidgetIntrospector extends DefaultWidgetIntrospector {
	public static String[] SCALE_WIDGET_NON_PROPERTIES = new String[]{
		"scale",
		"opaque"
	};
	@Override
	public String[] getNonProperties() {
	
		return concatenateStringArrays(super.getNonProperties(), SCALE_WIDGET_NON_PROPERTIES);
	}
	
}
