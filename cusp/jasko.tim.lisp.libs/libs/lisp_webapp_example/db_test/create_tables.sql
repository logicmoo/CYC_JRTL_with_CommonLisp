--*********************************************************
-- Author: Berlin Brown
--
-- Description:
-- Main sql script for creating the botlist database.
--
-- updated: 11/12/2006
--
-- file: create_tables.sql
-- see insert_tables.sql
--
-- Modifications: 
-- 2/2/2008 - sql clean-ups, made sure script is up to date.
--*********************************************************


-- Create the simple user blog
-- Users have user-links
-- The foreign key is attached to the 'has-a'
--
-- entity_links is currently associated with
--  'child_list_links' and 'user_comments'
CREATE TABLE entity_links (
  id                     int(11) NOT NULL auto_increment,
  main_url               varchar(255) NOT NULL,
  url_title              varchar(128) NOT NULL,
  url_description        varchar(255) default NULL,
  keywords               varchar(255) default NULL,
  views int(11)          default '0',
  created_on datetime    NOT NULL default '0000-00-00 00:00:00',
  rating int(11)         NOT NULL default '0',
  user_id int(11)        default NULL,
  full_name              varchar(128) NOT NULL,
  hostname               varchar(128) default NULL,
  process_count          int(11) NOT NULL default '0',
  updated_on             datetime default '0000-00-00 00:00:00',
  link_type              varchar(20) default NULL,
  bot_rating             decimal(5,2) default '0.00',
  generated_obj_id       varchar(60) default NULL,
  user_up_votes          int(11) default '0',
  user_down_votes        int(11) default '0',
  links_ct               int(11) default '0',
  inbound_link_ct        int(11) default '0',
  outbound_links_ct      int(11) default '0',
  image_ct               int(11) default '0',
  meta_descr_len         int(11) default '0',
  meta_keywords_len      int(11) default '0',
  meta_descr_wct         int(11) default '0',
  meta_keywords_wct      int(11) default '0',
  geo_locations_ct       int(11) default '0',
  geo_locations_found    varchar(128) default NULL,
  document_size          int(11) default '0',
  request_time           int(11) default '0',
  object_id_status       tinyint(4) default '0',
  para_tag_ct            int(11) default '0',
  PRIMARY KEY  (id),
  UNIQUE KEY main_url (main_url),
  UNIQUE KEY generated_obj_id (generated_obj_id),
);

-- End of file