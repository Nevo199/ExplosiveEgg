// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelevokering1 extends EntityModel<Entity> {
	private final ModelRenderer head;

	public Modelevokering1() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(28, 38).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 35).addBox(4.0F, -7.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(8, 33).addBox(-5.0F, -7.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(28, 35).addBox(-5.0F, -7.0F, 4.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}