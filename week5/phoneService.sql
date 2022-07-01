
CREATE TABLE IF NOT EXISTS `service`.`brand` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `service`.`phone`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `service`.`phone` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `memory` INT NULL,
  `ram` INT NOT NULL,
  `year_of_issue` DATE NOT NULL,
  `brand_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `brand_idx` (`id_brand` ASC) VISIBLE,
  CONSTRAINT `brand`
    FOREIGN KEY (`id_brand`)
    REFERENCES `service`.`brand` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `service`.`price`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `service`.`price` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `price` DECIMAL(10) NOT NULL,
  `phone_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `phone_idx` (`id_phone` ASC) VISIBLE,
  CONSTRAINT `phone`
    FOREIGN KEY (`id_phone`)
    REFERENCES `service`.`phone` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `service`.`employees`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `service`.`employees` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  `phone_number` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `service`.`client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `service`.`client` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  `phone_number` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `service`.`operation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `service`.`operation` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Date_sale` DATE NOT NULL,
  `cash` INT NULL,
  `change` INT NULL,
  `phone_id` INT NOT NULL,
  `employees_id` INT NOT NULL,
  `client_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_operation_phone1_idx` (`phone_id` ASC) VISIBLE,
  INDEX `fk_operation_employees1_idx` (`employees_id` ASC) VISIBLE,
  INDEX `fk_operation_client1_idx` (`client_id` ASC) VISIBLE,
  CONSTRAINT `fk_operation_phone1`
    FOREIGN KEY (`phone_id`)
    REFERENCES `service`.`phone` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_operation_employees1`
    FOREIGN KEY (`employees_id`)
    REFERENCES `service`.`employees` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_operation_client1`
    FOREIGN KEY (`client_id`)
    REFERENCES `service`.`client` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
