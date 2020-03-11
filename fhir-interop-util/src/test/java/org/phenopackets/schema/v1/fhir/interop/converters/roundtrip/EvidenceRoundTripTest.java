package org.phenopackets.schema.v1.fhir.interop.converters.roundtrip;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.phenopackets.schema.v1.core.Evidence;
import org.phenopackets.schema.v1.core.ExternalReference;
import org.phenopackets.schema.v1.core.OntologyClass;


/**
 * The purpose of this test is to check whether we can round trip Evidence from Phenopackets to FHIR and back again
 */
public class EvidenceRoundTripTest {

    static private Evidence evidence;

    static private org.hl7.fhir.r4.model.Evidence fhirEvidence;

    @BeforeAll
    static void init() {
        OntologyClass ecoAuthorStatement = OntologyClass.newBuilder().
                setId("ECO:0006017").
                setLabel("author statement from published clinical study used in manual assertion").
                build();
        ExternalReference pmidExternalReference = ExternalReference.newBuilder().
                setId("PMID:30962759").
                setDescription("Recurrent Erythema Nodosum in a Child with a SHOC2 Gene Mutation").
                build();

        evidence = Evidence.newBuilder().
                setEvidenceCode(ecoAuthorStatement).
                setReference(pmidExternalReference).
                build();
    }


    @Test
    void goToFhir() {
        fhirEvidence = new org.hl7.fhir.r4.model.Evidence();
    }





}
