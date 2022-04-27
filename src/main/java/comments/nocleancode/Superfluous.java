package src.main.java.comments.nocleancode;

import src.main.java.names.nocleancode.classnames.Manager;

import javax.management.MBeanRegistration;
import javax.naming.directory.DirContext;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

/*Now consider the legion of useless and redundant javadocs in Listing 4-2 taken from Tomcat.
        These comments serve only to clutter and obscure the code. They serve no documentary purpose at all.
        To make matters worse, I only showed you the first few.*/

public class Superfluous {

    public abstract class ContainerBase implements Container, Lifecycle, Pipeline, MBeanRegistration, Serializable {
        /**
         * The processor delay for this component.
         */
        protected int backgroundProcessorDelay = -1;
        /**
         * The lifecycle event support for this component.
         */
        protected LifecycleSupport lifecycle = new LifecycleSupport(this);
        /**
         * The container event listeners for this Container.
         */
        protected ArrayList listeners = new ArrayList();
        /**
         * The Loader implementation with which this Container is * associated.
         */
        protected Loader loader = null;
        /**
         * The Logger implementation with which this Container is * associated.
         */
        protected Log logger = null;
        /**
         * Associated logger name.
         */
        protected String logName = null;
        /**
         * The Manager implementation with which this Container is * associated.
         */
        protected Manager manager = null;
        /**
         * The cluster with which this Container is associated.
         */
        protected Cluster cluster = null;
        /**
         * The human-readable name of this Container.
         */
        protected String name = null;
        /**
         * The parent Container to which this Container is a child.
         */
        protected Container parent = null;
        /**
         * The parent class loader to be configured when we install a * Loader.
         */
        protected ClassLoader parentClassLoader = null;
        /**
         * The Pipeline object with which this Container is
         * associated.
         */
        protected Pipeline pipeline = new StandardPipeline(this);
        /**
         * The Realm with which this Container is associated.
         */
        protected Realm realm = null;
        /**
         * The resources DirContext object with which this Container * is associated.
         */
        protected DirContext resources = null;

    }
