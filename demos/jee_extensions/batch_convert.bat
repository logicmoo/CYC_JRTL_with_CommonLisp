set source=C:\deri\workspace\larkc_sf_context\platform\dist\plugins\

java -jar build/jar/larkc_jee_converter.jar %source%PassItOnTransformer.larkc PassItOnTransformer.war eu.larkc.plugin.transform.passitontransformer.PassItOnTransformer query_transformer 
java -jar build/jar/larkc_jee_converter.jar %source%SPARQLToTriplePatternQueryTransformer.larkc SPARQLToTriplePatternQueryTransformer.war eu.larkc.plugin.transform.sparqltotriplepatternquerytransformer.SPARQLToTriplePatternQueryTransformer query_transformer 

java -jar build/jar/larkc_jee_converter.jar %source%SindiceTriplePatternIdentifier.larkc SindiceTriplePatternIdentifier.war eu.larkc.plugin.identify.sindice.SindiceTriplePatternIdentifier identifier
java -jar build/jar/larkc_jee_converter.jar %source%SimpleFileReaderIdentifier.larkc SimpleFileReaderIdentifier.war eu.larkc.plugin.identify.filereader.SimpleFileReaderIdentifier identifier

java -jar build/jar/larkc_jee_converter.jar %source%NullDataTransformer.larkc NullDataTransformer.war eu.larkc.plugin.transform.nulldatatransformer.NullDataTransformer data_transformer
java -jar build/jar/larkc_jee_converter.jar %source%xml2rdf_transformer.larkc xml2rdf_transformer.war eu.larkc.plugin.transform.urbancomputing.ubl.XML2RDFTransformer data_transformer

java -jar build/jar/larkc_jee_converter.jar %source%GrowingDataSetSelecter.larkc GrowingDataSetSelecter.war eu.larkc.plugin.select.simple.GrowingDataSetSelecter selecter
java -jar build/jar/larkc_jee_converter.jar %source%SPARQLKeyword.larkc SpreadingActivationSelecter.war eu.larkc.plugin.select.sparqlkeyword.SASelecter selecter
java -jar build/jar/larkc_jee_converter.jar %source%SPARQLKeyword.larkc BaseLineFTSelecter.war eu.larkc.plugin.select.sparqlkeyword.BaseLineFTSelecter selecter

java -jar build/jar/larkc_jee_converter.jar %source%IrisRuleReasoner.larkc IrisRuleReasoner.war eu.larkc.plugin.reason.irisrulereasoner.IrisRuleBasedReasoner reasoner
java -jar build/jar/larkc_jee_converter.jar %source%SparqlQueryEvaluationReasoner.larkc SparqlQueryEvaluationReasoner.war eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner reasoner

