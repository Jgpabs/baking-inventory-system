CREATE OR REPLACE TRIGGER QKC_RAW_MATERIAL_LIST
BEFORE INSERT ON QKC_RAW_MATERIAL_LIST FOR EACH ROW
BEGIN
    SELECT NVL(MAX(MATERIAL_CD),0) + 1
      INTO :NEW.MATERIAL_CD
      FROM QKC_RAW_MATERIAL_LIST;
END;