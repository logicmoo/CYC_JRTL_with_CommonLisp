package com.cyc.xml.query;

import java.io.IOException;


import javax.xml.bind.JAXBException;

import static com.cyc.xml.query.Constants.PROOFVIEW_NAMESPACE;
import static com.cyc.baseclient.xml.cycml.Constants.CYCML_NAMESPACE;
import org.w3c.dom.Node;

import com.cyc.baseclient.xml.CycJAXBMarshaller;

/**
 * A class to output ProofViews in XML.
 *
 * @author baxter
 */
public class ProofViewMarshaller extends CycJAXBMarshaller<ProofView> {

    /**
     * Construct a new ProofViewMarshaller.
     *
     * @throws JAXBException
     */
    public ProofViewMarshaller() throws JAXBException {
        super(ProofView.class);
        setDefaultNamespace(PROOFVIEW_NAMESPACE);
        setPreferredPrefix(CYCML_NAMESPACE, "cycml");
    }

    /**
     * Output the specified entry to the specified DOM Node.
     *
     * @param entry
     * @param destination
     * @throws JAXBException
     * @see javax.xml.bind.Marshaller#marshal(java.lang.Object,
     * org.w3c.dom.Node) .
     */
    public void marshal(final ProofViewEntry entry, final Node destination) throws JAXBException, IOException {
        marshaller.marshal(entry, destination);
    }
}
