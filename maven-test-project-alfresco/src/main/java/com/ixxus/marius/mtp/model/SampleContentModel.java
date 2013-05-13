package com.ixxus.marius.mtp.model;

import org.alfresco.service.namespace.QName;

/**
 * 
 * TODO: Change the name to something other than SampleContentModel
 *
 */
public class SampleContentModel {
    public final static String NAMESPACE_URI = "http://www.ixxus.co.uk/model/maven-test-project/1.0";
    public final static String NAMESPACE_PREFIX = "mtp";

    public static final class SampleAspect {
        public static final QName ASPECT = mtp("sampleAspect");

        private SampleAspect() {
        }

        public static final class Prop {
            private Prop() {
            }
            
            public static final QName SAMPLE_ASPECT_PROPERTY = mtp("sampleAspectProperty");
        }
    }

    public static final class SampleType {
    	public static final QName TYPE = mtp("sampleType");

    	private SampleType() {
    	}

    	public static final class Prop {
            private Prop() {
            }
            
            public static final QName SAMPLE_TYPE_PROPERTY = mtp("sampleTypeProperty");
        }
    }
    
    public static QName mtp(final String qname) {
        return QName.createQName(NAMESPACE_URI, qname);
    }
}