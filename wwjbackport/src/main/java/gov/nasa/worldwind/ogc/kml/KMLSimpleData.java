/*
Copyright (C) 2001, 2010 United States Government
as represented by the Administrator of the
National Aeronautics and Space Administration.
All Rights Reserved.
*/

package gov.nasa.worldwind.ogc.kml;

import gov.nasa.worldwind.util.xml.AbstractXMLEventParser;

/**
 * Represents the KML <i>SimpleData</i> element and provides access to its contents.
 *
 * @author tag
 * @version $Id: KMLSimpleData.java 13396 2010-05-25 21:02:14Z tgaskins $
 */
public class KMLSimpleData extends AbstractXMLEventParser
{
    /**
     * Construct an instance.
     *
     * @param namespaceURI the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    public KMLSimpleData(String namespaceURI)
    {
        super(namespaceURI);
    }

    public String getName()
    {
        return (String) this.getField("name");
    }
}
